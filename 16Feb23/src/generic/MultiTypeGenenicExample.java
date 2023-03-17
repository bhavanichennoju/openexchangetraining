package generic;

public class MultiTypeGenenicExample {

	public static void main(String[] args) {
		BottleExample<String, String, Double> b1=new BottleExample<String, String, Double> ();
		b1.setdata("ctablet", "C Company", 20.00);
		System.out.println(b1);

	}

}
