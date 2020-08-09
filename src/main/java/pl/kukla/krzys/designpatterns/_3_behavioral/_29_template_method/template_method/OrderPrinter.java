package pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method;

import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.Order;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * in Template Method patter we have method which contains steps ( call other method ) to make any feature
 * in base class in method we define an algorithm as series of steps ( calls methods )
 * each step ( method ) in this base class is defined as abstract and we provide implementation for those in Subclasses
 * TemplateMethod pattern allows to defer implementation of parts of algorithm to Subclasses
 * TemplateMethod pattern is an example of Inversion of control principal
 * Dependency Injection in spring is other type of IoC principal
 * Factory method pattern is often implemented as an part of Template method design pattern
 */
//Abstract base class which represents TemplateMethod which will be called by the Client
public abstract class OrderPrinter {
    //this method should be final to avoid extend it
    public final void printOrder(Order order, String fileName) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(fileName)) {

            //call all template methods - should avoid to have many methods there, because hard to maintain
            //print some header
            String header = header();
            String formatOrderNumber = formatOrderNumber(order);
            String formatItems = formatItems(order);
            String formatTotal = formatTotal(order);
            String footer = footer();

            writer.println(header);
            writer.println(formatOrderNumber);
            writer.println(formatItems);
            writer.println(formatTotal);
            writer.println(footer);
        }
    }

    //all protected methods will be use in Subclasses
    //this method returns header of file that is being created
    protected abstract String header();

    //returns formatted String, that we are going to write
    protected abstract String formatOrderNumber(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    //returns footer for particular file
    protected abstract String footer();

}
