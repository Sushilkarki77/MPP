package lesson9.labs.prob2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    List<Order> orders;

    public static void main(String[] args) {
        Main m = new Main();
        m.loadOrderData();
        m.displayAllOrders();
        m.showAllOrderItems();

    }

    //Uses flatMap to write to console a list of all order items
    private void showAllOrderItems() {
        System.out.println("\n==============\nAll order items:");
        //implement


        System.out.println(orders.stream().flatMap(x -> x.getOrderItems().stream()
                .map(OrderItem::toString)).collect(Collectors.joining(";")));


    }

    private void displayAllOrders() {
        System.out.println(orders.stream().map(Order::toString).collect(Collectors.joining(",")));

        public class Employee {

            String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            int salary;

            public Employee(String n, int s) {
                this.name = n;
                this.salary = s;
            }

            @Override
            public String toString() {
                return "[" + name + ", " + salary + "]";
            }

            public static void main(String[] args) {
                List<Employee> list = new ArrayList<Employee>() {
                    {
                        add(new Employee("Joe", 50000));
                        add(new Employee("Jim", 75000));
                        add(new Employee("Tom", 80000));
                        add(new Employee("Jim", 70000));
                        add(new Employee("Steve", 55000));
                        add(new Employee("Jim", 100000));
                        add(new Employee("Joe", 59000));
                        add(new Employee("Rich", 88000));
                    }
                };

                Stream<Employee> x = list.stream();

                Comparator<Employee> e = ((e1, e2) -> e1.name.compareTo(e2.name));



                //expected output:
                //[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
                x.sorted(Comparator.comparing((Employee e1) -> e1.name).thenComparing(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
            }

        }
    }

    private void loadOrderData() {
        orders = new ArrayList<>();
        Order o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1001", 2, 11);
        o.addOrderItem("1002", 1, 23);
        o.addOrderItem("1003", 1, 45);
        orders.add(o);

        o = new Order(LocalDate.of(2001, 11, 15), "11-220", "1015", 2, 33);
        o.addOrderItem("1016", 3, 15);
        o.addOrderItem("1017", 1, 22);
        o.addOrderItem("1018", 2, 19);
        o.addOrderItem("1019", 5, 9);
        orders.add(o);

        o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1022", 1, 80);
        o.addOrderItem("1023", 1, 28);
        o.addOrderItem("1024", 1, 41);
        orders.add(o);
    }

}
