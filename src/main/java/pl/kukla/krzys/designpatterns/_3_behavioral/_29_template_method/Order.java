package pl.kukla.krzys.designpatterns._3_behavioral._29_template_method;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

//This is abject which want to print using TemplateMethod design pattern
@Getter
public class Order {
    private String id;
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();
    private double total;

    public Order(String id) {
        this.id = id;
    }

    public void addItem(String key, Double value) {
        items.put(key, value);
    }

}
