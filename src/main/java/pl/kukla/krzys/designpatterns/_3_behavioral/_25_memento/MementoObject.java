package pl.kukla.krzys.designpatterns._3_behavioral._25_memento;

/**
 * Memento allows to restore ( undo ) state object to previous ( saved ) state
 * Memento takes a snapshot of object state
 * Memento allows to store state of object and ensures that nobody can read or modify internal state of that object
 * nobody has access ( read, modify ) to that state - only possible in Memento state
 * for example we want to take a snapshot of object state at this particular moment in time and then use this saved state to perform some
 * operations in the future for example 'undo' functionality in Word
 * Memento should NOT allow to read state - only Originator which creates Memento should be able what is stored in Memento and modify or create
 * Memento object
 * to use Memento design we will use other design pattern called Command
 * before use Memento we should always keep an eye ( miej na oku ) size of state stored in Memento - in such case consider to apply limit of
 * objects in memento
 * we have CareTaker class which holds all memento created object ( for example this could be collection )
 * before resetting to previous state we should always consider effect on states on other objects - in many case states for other related object
 * should be reset as well - otherwise states will be invalid
 * Memento is used for undo functionality like javax.swing.text.JTextComponent
 */
public class MementoObject {
}
