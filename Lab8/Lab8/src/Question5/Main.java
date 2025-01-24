package Question5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format
        list.forEach(consumer);
        list.forEach(consumer1);
        list.forEach(consumer2);
    }


    //implement a Consumer
    static Consumer<String> consumer = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s.toUpperCase());
        }
    };

    static Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase()); //a
    static Consumer<String> consumer2 = Main::printUpperCase; //b


    static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }

}
