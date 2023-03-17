import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"AA","Bombay"));
		list.add(new Employee(2,"AA","Bhongir "));
		list.add(new Employee(3,"BB ","Bhongir "));
		list.add(new Employee(4,"BY","Madhupur"));
		list.add(new Employee(5,"CJ","Aler"));
		list.add(new Employee(6,"CK","Begumpet"));
		Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getEmployeeName)
                .thenComparing(Employee::getEmployeeAdress);
		
		List<Employee> listByEmployeeName=list.stream().sorted(compareByName)
				.collect(Collectors.toList());
		listByEmployeeName.forEach(System.out::println);

		
		
		System.out.println("lllllllllllllllllllllllllll");
		 List<Employee> sortedList = list.stream().sorted(
	                        Comparator.comparing(Employee::getEmployeeName)
	                        .thenComparing(Employee::getEmployeeAdress)) 
	                .collect(Collectors.toList()); 
		 sortedList.stream().forEach(System.out::println);

		
//		List<Employee> listByEmployeeName1=list.stream().sorted(Comparator.comparing(Employee::getEmployeeName))
//				.collect(Collectors.toList());
//		listByEmployeeName1.forEach(System.out::println);
//		System.out.println("lllllllllllllllllllllllllll");
//		
//		List<Employee> listByEmployeeAddress=listByEmployeeName1.stream().sorted(Comparator.comparing(Employee::getEmployeeAdress))
//				.collect(Collectors.toList());
//		listByEmployeeAddress.forEach(System.out::println);


}
}
