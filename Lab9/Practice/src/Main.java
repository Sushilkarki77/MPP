import java.math.BigInteger;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Stream<String> stream0 = Stream.generate(() -> "Echo ");
        Stream<BigInteger> stream1 = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));

        Stream<Integer> stream2 = Stream.iterate(1, n -> n + 1);

        stream2.limit(20).forEach(System.out::println);
    }
}