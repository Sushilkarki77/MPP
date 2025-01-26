package Question5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 6, 8, 7, 0));
        Integer secondSmallest = findSecondSmallest(list1);
        System.out.println(secondSmallest);

    }

    public static <T extends Comparable<T>> T findSecondSmallest(List<T> list) {

        if (list.size() <= 1) return list.get(0);

        T smallest = list.getFirst();
        T secondSmallest = list.get(1);

        for (T x : list) {
            if (x.compareTo(secondSmallest) < 0) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x.compareTo(smallest) > 0 && x.compareTo(secondSmallest) < 0) {
                secondSmallest = x;
            }
        }
        return secondSmallest;
    }
}
