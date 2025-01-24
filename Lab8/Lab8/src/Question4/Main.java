package Question4;

import java.util.List;

public class Main {
    public static int countWords(List<String> words, char c, char d, int len) {
        return words.stream().filter(x -> x.length() == len).
                filter(y -> y.indexOf(c) != -1).
                filter(z -> z.indexOf(d) == -1).toList().size();
    }

    public static void main(String[] args) {
        int count = countWords(List.of("hello", "halls", "hands"), 'h', 'z', 5);
        System.out.println(count);
    }
}


//Implement  a method with the following signature and return type:
//public int countWords(List<String> words, char c, char d, int len)
//which counts the number of words in the input list words that have length equal to len, that
//contain the character c, and that do not contain the character d. Create a solution like the "Good"
//solution in lesson8.lecture.f