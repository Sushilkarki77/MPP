package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.OrderManagement.CustOrderFactory;
import lesson5.labs.prob4.OrderManagement.Customer;
import lesson5.labs.prob4.OrderManagement.Order;


public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.CreateCustomer("Bob");
		Order order = CustOrderFactory.addOrder(cust);
		CustOrderFactory.addItemToOrder(order, "Shirt");
		CustOrderFactory.addItemToOrder(order, "Laptop");

		order = CustOrderFactory.addOrder(cust);
		CustOrderFactory.addItemToOrder(order, "Pants");
		CustOrderFactory.addItemToOrder(order, "Knife");

		System.out.println(cust.getOrders());
	}
}

		
