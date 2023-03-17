import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "AA", "Bombay"));
		list.add(new Employee(2, "AA", "Bhongir "));
		list.add(new Employee(3, "BB ", "Bhongir "));
		list.add(new Employee(4, "BY", "Madhupur"));
		list.add(new Employee(5, "AA", "Aler"));
		list.add(new Employee(6, "CK", "Begumpet"));

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Employee::getEmployeeName, Collectors.counting()));
	
		System.out.println(result);
	}
}
