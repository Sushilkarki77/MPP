package prob1.partD;

import java.util.Objects;

public class Employee {
	private String name;
	private int salary;
//	private boolean visited = false;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

//	public void setVisited(boolean b) {
//		visited = b;
//	}

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

	@Override
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == this) return true; // Check for reference equality
		if (!(ob instanceof Employee emp)) return false;

        return (Objects.equals(name, emp.name))
				&& emp.salary == salary;
//				&& emp.visited == visited;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (name == null ? 0 : name.hashCode());
		result = 31 * result + salary; // Fixed for int
//		result = 31 * result + (visited ? 1 : 0);
		return result;
	}
}
