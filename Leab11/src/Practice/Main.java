package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class
Main {
    public static void main(String[] args) {

        String[] array = {"Ram", "Hari", "Gopal"};

        List<String> strings = new ArrayList<>(List.of(array));

        String max = max1(strings);

        List<Employee> employeeList = new ArrayList<>(List.of(new Employee("Sushil")));

        List<Object> objs = Arrays.asList(2, 3.14, "four");
        List<Integer> ints = Arrays.asList(5, 6);
        Collections.copy(objs, ints);
        System.out.println(objs.toString());

        List<Object> listX = new ArrayList<>(List.of("adsasd", 1, 5, 8.0));

        List<Integer> listI = new ArrayList<>(List.of(0, 1, 2, 3));
        List<?> listY = new ArrayList<>(List.of(9, 8, 1));

        processList(listX);
//        processList(listY);

    }


    public static <T extends Comparable<T>> T max1(List<T> list) {
        T max = list.getFirst();

        for (T i : list) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

    static <T> int countOccurrence(T[] arr, T target) {
        int count = 0;
        if (target == null) {
            for (T item : arr) {
                if (item == null) {
                    count++;
                }
            }
        } else {
            for (T item : arr) {
                if (target.equals(item)) {
                    count++;
                }
            }
        }
        return count;
    }

    static void processList(List<? super Number> list) {

        System.out.println(list.getFirst()); // Needs casting if treating as Integer
    }


}


class Pair<K, V> implements PairInterface<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

interface PairInterface<K, V> {
    K getKey();

    V getValue();
}


class Employee implements Comparable<Employee> {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}





