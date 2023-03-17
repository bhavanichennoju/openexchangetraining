
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithOutUsingContainMethod {
	public static void main(String args[]) {
		 List<String> listOfNames1 = new ArrayList<>(Arrays.asList("bhanu", "pinky", "chinna", "divya"));
			boolean b1=listOfNames1.stream().anyMatch(s->s.contains("bhanu"))	;
			System.out.println("is listOfNames1 contains bhanu  " + b1);
			
			boolean exists = listOfNames1.stream().anyMatch("PINKY"::equalsIgnoreCase);
			System.out.println("is listOfNames1 contains pinky  " + exists);
			

	}

}