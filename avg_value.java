package java1_8;

import java.util.Arrays;
import java.util.List;

public class avg_value {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		double d = l.stream().mapToInt(f -> f).average().getAsDouble();
		System.out.println(d);
	}

}
