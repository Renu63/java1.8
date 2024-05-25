package java1_8;

import java.util.Arrays;
import java.util.List;

public class cube {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		l.stream().map(f -> f * f * f).forEach(f -> System.out.println(f));
	}

}
