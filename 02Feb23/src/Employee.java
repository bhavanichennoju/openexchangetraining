
public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeAdress=" + employeeAdress + "]";
	}


	int id;
	String employeeName;
	String employeeAdress;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String employeeName, String employeeAdress) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAdress = employeeAdress;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeAdress() {
		return employeeAdress;
	}


	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAdress = employeeAdress;
	}


	

}
