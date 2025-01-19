package lesson5.labs.prob4.OrderManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private LocalDate orderDate;
    private List<Item> items;
    private Customer associatedCustomer;

    //use a factory method
    Order(LocalDate orderDate,  Customer c) {
        this.orderDate = orderDate;
        items = new ArrayList<Item>();
        associatedCustomer = c;
    }

    void addItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                items.toString();
    }
}


