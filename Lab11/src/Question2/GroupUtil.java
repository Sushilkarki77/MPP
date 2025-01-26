package Question2;

import java.util.Arrays;
import java.util.List;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
		return copyInner(group);
	}

	static <T> Group<T> copyInner(Group<T> group){
		return new Group<T>(group.getSpecialElement(), group.getElements());
    }
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		//System.out.println(GroupUtil.copy(group));
	}
}
