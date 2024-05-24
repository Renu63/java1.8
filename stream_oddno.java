package java1_8;

import java.util.Arrays;
import java.util.List;

public class stream_oddno {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		// odd numbers
		l.stream().filter(f -> f % 2 != 0).forEach(f -> System.out.println(f));
	}

}
