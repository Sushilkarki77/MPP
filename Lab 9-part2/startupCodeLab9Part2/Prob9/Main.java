package lesson9.labs.Prob9;

import java.util.stream.Stream;

public class Main {

    public static void printSquares(int num) {
        Stream<Integer> streamInt = Stream.iterate(1, n -> n + 1);

        streamInt.limit(num).forEach(x -> System.out.println(x * x));
    }

    public static void main(String[] args) {
        printSquares(4);
        printSquares(5);
    }
}
