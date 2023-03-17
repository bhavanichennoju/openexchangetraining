import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Addition{
	abstract int addition(int a,int b);
	// List<Integer> list(List<Integer> l1);
	
}


public class ExampleFunctionalInterface {

	public static void main(String[] args) {
		Addition add=(a,b)->a+b;
		int results=add.addition(3, 7);
		System.out.println(results);
//		Addition a1=(n)->n;
//		List<Integer> ints=Arrays.asList(1,2,3,4,5);
//		List<Integer> int2=a1.list(ints);
//		System.out.println(int2);

	}

}
