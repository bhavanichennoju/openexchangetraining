import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ListOfEvenNumbers{
	List<Integer> list(List<Integer> list);
	
}
public class ExampleOne implements ListOfEvenNumbers{

	public static void main(String[] args) {
		ExampleOne e=new ExampleOne();
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(e.list(l1));
	}

	@Override
	public List<Integer> list(List<Integer> list) {
		List<Integer> l2=new ArrayList<Integer>();
		for(int i = 1; i <= list.size(); i++)
		{
			if(i % 2 == 0)
			{
				l2.add(i); 
			}
		}	
		return l2;
	}

}
