package pl.kukla.krzys.designpatterns._3_behavioral._21_command;

/**
 * Command pattern allows to treat methods from Service class as an Object and that allows to defer execution of them
 * we want to represent request or methods calling as an object
 * and those operations are encapsulated in Object
 * we can send this object to different part of our code, send to remote server etc.
 * add this object to the collection
 * we can have a separate Thread
 * then command will execute methods on receiver object which is regular object
 * this command object will have information about the object and method which we want to call and arguments which we want to pass
 * we can treat that methods as an object ( command object )
 * so instead method we have an object which allows us to defer ( odroczyc ) execution for later, pass to collection and execute on other Thread
 * Command allows to execute 'undo' ( cofniecie )  and 'redo' ( ponowienie ) in later time
 * we can queue commands in queue and use it in the future
 * to 'undo' we can use Memento design pattern as well
 * Runnable is example of Command design pattern
 */
@FunctionalInterface
public interface Command {

    void execute();

}
