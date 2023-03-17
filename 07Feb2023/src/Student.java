
public class Student {
	int rollId;
	String name;
	static String collegeName = "JNTU College";

	public Student(int rollId, String name) {
		super();
		this.rollId = rollId;
		this.name = name;
	}

	public int getRollId() {
		return rollId;
	}

	public void setRollId(int rollId) {
		this.rollId = rollId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	void display() {
		System.out.println(rollId + " " + name + " " + collegeName);
	}
}
