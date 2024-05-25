package java1_8;

import java.util.Arrays;
import java.util.List;

public class uppercase {

	public static void main(String[] args) {
		List<String> string_List = Arrays.asList("one", "two", "three", "four", "five");
		string_List.stream().map(m -> m.toUpperCase()).forEach(f -> System.out.println(f));
	}

}
