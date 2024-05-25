package java1_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class duplicateno {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 15, 8, 49, 25, 98, 12, 15, 2, 98, 12, 15, 2, 98, 20);

		l.stream().filter(f -> Collections.frequency(l, f) > 1).forEach(f -> System.out.println(f));

	}

}
