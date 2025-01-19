package lesson5.labs.prob4.OrderManagement;

import java.time.LocalDate;

public interface CustOrderFactory {
    public static Customer CreateCustomer(String name){
        return new Customer(name);
    }

    private static Order createnewOrder(Customer cust, LocalDate date) {
        if(cust == null) throw new NullPointerException("Null customer");
        return new Order(date, cust);
    }

    public static Item createItem(String name){
        return new Item(name);
    }

    public static void addItemToOrder(Order order, String item){
        order.addItem(createItem(item));
    }

    public static Order addOrder(Customer customer) {
        Order newOrder = createnewOrder(customer, LocalDate.now());
        customer.addOrder(newOrder);
        return newOrder;
    }
}
