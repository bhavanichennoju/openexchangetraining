public class StaticBindingExample {
	public static void main(String args[]) {
		 // reference is of parent class and child class-object type
		ParentClassStatic psc=new ChildClassStatic();
		psc.start();
		//here both reference,object same 
		ParentClassStatic pc = new ParentClassStatic();
		pc.start();
	}
}

class ParentClassStatic {
	static void start() {
		System.out.println("parent class method");
	}
}

class ChildClassStatic extends ParentClassStatic {
	static void start() {
		System.out.println("child class method");
	}
}