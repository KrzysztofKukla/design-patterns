package pl.kukla.krzys.designpatterns.behavioral.observer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * This is our Subject - Observable ( oberwowany )
 * whenever something change in this object, then it trigger notification about that in Observers objects ( Listeners )
 */
@Getter
@RequiredArgsConstructor
@ToString(exclude = "observers")
public class Order {
    private final String id;

    //avoid double and use BigDecimal, BigInteger to calculate values
    //cost of items
    private double itemCost;

    //no of items
    private int count;

    private double totalCost;

    @Setter
    //discount ( rabat )
    private double discount;

    @Setter
    //shipping cost ( koszt wysyłki )
    private double shippingCost;

    public void addItem(double price) {
        itemCost += price;
        count++;
        //here we notify about update all registered observers
        observers.forEach(o -> o.updated(this));
    }

    private List<OrderObserver> observers = new ArrayList<>();

    //register Order to Observer
    public void attach(OrderObserver orderObserver) {
        observers.add(orderObserver);
    }

    //deregister object
    public void detach(OrderObserver orderObserver) {
        observers.remove(orderObserver);
    }

    public double getTotalCost() {
        return itemCost - discount + shippingCost;
    }

}
