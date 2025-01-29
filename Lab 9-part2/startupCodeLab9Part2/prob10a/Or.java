package lesson9.labs.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(false));
        System.out.println(someSimpleIsTrue(list));

	}

	public static boolean someSimpleIsTrue(List<Simple> list) {


        return list.stream().map(x-> x.flag).reduce(false, (acc, curr)-> acc || curr);

	}

}
