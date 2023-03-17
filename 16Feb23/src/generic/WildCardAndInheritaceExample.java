package generic;

public class WildCardAndInheritaceExample {

	public static void main(String[] args) {
		OralMedicine l1=new Tablet();
		OralMedicine l2=new Capusule();
		//OralMedicine l3=new Injection();
		
		Bottle<?> tabletBottle=new Bottle<Tablet>(new Tablet());
		Bottle<?> capsuleBottle=new Bottle<Capusule>(new Capusule());
		Bottle<?> injection=new Bottle<Injection>(new Injection());
		logDetailOfClass(capsuleBottle);
		logDetailOfClass(tabletBottle);
		logDetailOfClass(injection); 

	}
	private static void logDetailOfClass(Bottle<?> bottle) {
		System.out.println("className is "+ bottle.getItem().getClass().getName());
	}

}
