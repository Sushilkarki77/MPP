package Question2.Comperator2;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (Integer.compare(e1.salary, e2.salary) != 0) return Integer.compare(e1.salary, e2.salary);
        return e1.name.compareTo(e2.name);
    }
}