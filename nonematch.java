package java1_8;

import java.util.Arrays;
import java.util.List;

public class nonematch {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		boolean b1 = l.stream().noneMatch(f -> (f * f) > 100);
		System.out.println(b1);
	}

}
