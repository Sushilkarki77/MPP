package lesson5.labs.prob4.OrderManagement;

public class Item {
	String name;
	 Item(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
