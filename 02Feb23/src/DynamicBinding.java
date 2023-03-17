class ParentClass {
	void hello() {
		System.out.println("parent class method");
	}

}

class ChildClass extends ParentClass {
	void hello() {
		System.out.println("child class method");
	}

}

public class DynamicBinding {
	public static void main(String args[]) {
		ParentClass pc = new ChildClass();
		pc.hello();

	}

}
