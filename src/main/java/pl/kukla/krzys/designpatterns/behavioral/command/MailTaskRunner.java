package pl.kukla.krzys.designpatterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

/**
 * don't use in PROD
 * this is Worker - Invoker which executes commands
 * starts a worker Thread in charge of executing commands
 */
@Slf4j
public class MailTaskRunner implements Runnable {
    private Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;

    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    private MailTaskRunner() {
        this.runner = new Thread(this);
        this.pendingCommands = new LinkedList<>();
        runner.start();
    }

    public static MailTaskRunner getInstance() {
        return RUNNER;
    }

    //run method takes pending commands and executes them
    @Override
    public void run() {
        while (true) {
            Command command = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException ex) {
                        log.info("Runner interrupted");
                        if (stop) {
                            log.info("Runner stopping");
                            return;
                        }
                    }
                } else {
                    command = pendingCommands.remove(0);
                }
            }
            if (command == null) {
                return;
            }
            command.execute();
        }
    }

    //passing it as a Command we will schedule it for later execution
    public void addCommand(Command command) {
        synchronized (pendingCommands) {
            pendingCommands.add(command);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }

}
