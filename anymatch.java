package java1_8;

import java.util.Arrays;
import java.util.List;

public class anymatch {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		boolean result = l.stream().anyMatch(f -> f % 2 != 0);
		System.out.println(result);
	}

}
