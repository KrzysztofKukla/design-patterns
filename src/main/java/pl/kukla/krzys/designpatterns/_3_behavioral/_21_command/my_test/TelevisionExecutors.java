package pl.kukla.krzys.designpatterns._3_behavioral._21_command.my_test;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class TelevisionExecutors {

    private final List<Command> commands;

    void run() {
        commands
                .forEach(Command::execute);
    }
}
