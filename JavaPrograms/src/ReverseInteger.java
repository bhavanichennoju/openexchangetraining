
public class ReverseInteger {

	public static void main(String[] args) {
		int i = 1234;
		int result = 0;
		while (i != 0) {
			int remainder = i % 10;// 4
			result = result * 10 + remainder;
			i = i / 10;
		}
		System.out.println(result);
	}

}
