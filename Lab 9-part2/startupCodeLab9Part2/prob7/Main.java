package lesson9.labs.prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		List<Integer> x = list.stream().sorted((e1,e2) ->Integer.compare(Math.abs(e1), Math.abs(e2))).toList();
		System.out.println(x);
		
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		System.out.println(/* implement */);

		List<String> reversedString = words.stream().sorted((x1,x2)->reverseString(x1).compareTo(reverseString(x2))).toList();
		System.out.println(reversedString);
	}

	public static String reverseString(String x) {
		return Arrays.stream(x.split("")).reduce("",(acc,curr)-> curr + acc);
	}

}
