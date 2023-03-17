
class ParentClass {
	int a;

	ParentClass(int x) {
		a = x;
		System.out.println("parent class");
	}
}

class ChildClass extends ParentClass {
	int b;

	ChildClass(int x, int y) {
		super(x);
		b = y;
	}

	void Show() {
		System.out.println("Value of a : " + a + "\nValue of b : " + b);
	}

	{
		System.out.println("instance block-1");
	}

	static {
		System.out.println("static block-1");
	}
}

public class OrderofExecution4 {
	public static void main(String ar[]) {
		System.out.println("Order of constructor execution...");
		ChildClass d = new ChildClass(79, 89);
		d.Show();
	}
	static {
		System.out.println("static block-3");
	}
	{
		System.out.println("instance block-2");
	}
}
