package lesson9.labs.prob10b;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Bill", "Thomas", "Mary"));
        System.out.println(list.stream().collect(Collectors.joining(",")));
    }
}


