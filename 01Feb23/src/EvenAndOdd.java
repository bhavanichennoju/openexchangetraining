import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Collections.reverseOrder();
		System.out.println(numbers);
		List<Integer> s=  numbers.stream().collect(Collectors.toList());
		System.out.println(s);
	}
}
