
public class Example {
	
	static int i=0;
	
	public void increment() {
		i++;
	}
	
	
	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example();
		e1.increment();
	//	e2.increment();
		System.out.println(i);
		
		
	}
}
