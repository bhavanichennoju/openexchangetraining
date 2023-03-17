import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeData {
	
	public static void main(String[] args) {
		List<EmployeeD> list=new ArrayList<EmployeeD>();
		list.add(new EmployeeD(1,"Bhavani",450,"A"));
		list.add(new EmployeeD(2,"pinky",350,"C"));
		list.add(new EmployeeD(3,"akash",400,"B"));
		list.add(new EmployeeD(4,"tinku",350,"C"));
		list.add(new EmployeeD(5,"ammulu",455,"A"));
		list.add(new EmployeeD(6,"hanvi",357,"C"));
		
		List<Double> fnameList = list.stream().map(EmployeeD::getTotolMarks).distinct().collect(Collectors.toList());
System.out.println(fnameList);
	
		
		
		
		
		
	}


}
