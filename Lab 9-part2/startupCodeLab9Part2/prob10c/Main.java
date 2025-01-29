package lesson9.labs.prob10c;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>(List.of(1,2,3,5,6));

        Optional<Integer> max = getMax(list);
        Optional<Integer> min = getMin(list);

        System.out.println(max.isPresent() ? max.get() : "none");
        System.out.println(min.isPresent() ? min.get() : "none");


    }

    static Optional<Integer> getMin(List<Integer> list){
        Stream<Integer> intStream = new ArrayList<>(list).stream();

        return intStream.max(Integer::compareTo);


    }

    static Optional<Integer> getMax(List<Integer> list){
        Stream<Integer> intStream = new ArrayList<>(list).stream();
        return intStream.min(Integer::compareTo);
    }



}



