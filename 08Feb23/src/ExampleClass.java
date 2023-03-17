class inheritance{
	static {
		System.out.println("inheritance static block");
	}
	{
		System.out.println("inheritance  instance block");
	}	
	
	public void welcome() {
		System.out.println("welcome");
	}
}



public class ExampleClass extends inheritance{
	static {
		System.out.println(" static block");
	}
	{
		System.out.println(" instance block");
	}
	public void welcome() {
		super.welcome();
		System.out.println("welcome home");
	}
	ExampleClass() {
		System.out.println("constructor");
	}

	ExampleClass(int a) {
		super();
		System.out.println("param constructor");
	}

	public static void demo() {
		System.out.println(" instance method");
	}

	public static void main(String args[]) {
		ExampleClass ec = new ExampleClass();
		ec.welcome();
	}
	static {
		System.out.println(" main static block");
	}
}
