package java1_8;

import java.util.Arrays;
import java.util.List;

public class addby5 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		l.stream().sorted().forEach(f -> System.out.println(f));
	}

}
