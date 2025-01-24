package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

    static List<Double> processDoubleNumbers(Double a, Double b, BiFunction<Double, Double, Double> f, BiFunction<Double, Double, Double> f2) {
        List<Double> list1 = new ArrayList<>();
        list1.add(f.apply(a, b));
        list1.add(f2.apply(a, b));
        return list1;

    }

    public static void main(String[] args) {
        BiFunction<Double, Double, Double> f = Math::pow;
        BiFunction<Double, Double, Double> f2 = (x, y) -> x * y;
        List<Double> output = processDoubleNumbers(2.0, 3.0, f, f2);
        List<Double> output2 = processDoubleNumbers(3.0, 4.0, f, f2);
        System.out.println(output);
        System.out.println(output2);
    }

}
