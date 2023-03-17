
public class EmployeeD {
	
	int id;
	String employeeName;
	double totolMarks;
	String grade;
	public EmployeeD() {
		super();
	}
	public EmployeeD(int id, String employeeName, double totolMarks, String grade) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.totolMarks = totolMarks;
		this.grade = grade;
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
	public double getTotolMarks() {
		return totolMarks;
	}
	public void setTotolMarks(double totolMarks) {
		this.totolMarks = totolMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "EmployeeD [id=" + id + ", employeeName=" + employeeName + ", totolMarks=" + totolMarks + ", grade="
				+ grade + "]";
	}
	

}
