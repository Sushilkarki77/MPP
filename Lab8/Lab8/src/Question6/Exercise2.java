package Question6;

import Question2.Comperator2.Employee;
import Question2.Comperator2.EmployeeNameComparator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercise2 {

    static Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    static Function<Employee, String> getName = Employee::getName;
    static BiFunction<String, String, Integer> compareStrings = (String s1, String s2) -> s1.compareTo(s2);
    static BiFunction<Integer, Integer, Double> power = (Integer x, Integer y) -> Math.pow(x, y);
    static Function<String, Integer> parseInt = (String x) -> Integer.parseInt(x);
    static EmployeeNameComparator comp = new EmployeeNameComparator();
    static BiFunction<Employee, Employee, Integer> emp = (Employee e1, Employee e2) -> comp.compare(e1, e2);


    public static void main(String[] args) {
        System.out.println(toUpper1.apply("hello"));
        System.out.println(getName.apply(new Employee("Sushil", 2000)));
        System.out.println(compareStrings.apply("hello", "hello"));
        System.out.println(power.apply(2,2));
        System.out.println(parseInt.apply("123"));
        System.out.println(emp.apply(new Employee("Sushil", 1000), new Employee("Ram", 2000)));

    }

}


//A. (Employee e) -> e.getName()
//B. (Employee e,String s) -> e.setName(s)
//C. (String s1,String s2) -> s1.compareTo(s2)
//D. (Integer x,Integer y) -> Math.pow(x,y)
//E. (Apple a) -> a.getWeight()
//F. (String x) -> Integer.parseInt(x);
//G. EmployeeNameComparator comp = new EmployeeNameComparator();
//(Employee e1, Employee e2) -> comp.compare(e1,e2)
