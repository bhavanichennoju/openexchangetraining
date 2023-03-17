public class DynamicExample {
	public static void main(String args[]) {
		ParentClassDynamic pc = new ChildClassDynamic();
		pc.start();
	}
}

class ParentClassDynamic {
	 void start() {
		System.out.println("parent class method");
	}
}

class ChildClassDynamic extends ParentClassDynamic {
	 void start() {
		System.out.println("child class method");
	}
}
//child class method...output
