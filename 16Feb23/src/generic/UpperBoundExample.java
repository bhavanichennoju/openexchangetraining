package generic;

public class UpperBoundExample {

	public static void main(String[] args) {
		logDetailOfClass(new Bottle<Tablet>(new Tablet()));
		logDetailOfClass(new Bottle<Capusule>(new Capusule()));
		writeOperation(new Bottle<Capusule>(new Capusule()));

	}
	private static void logDetailOfClass(Bottle<? extends OralMedicine> bottle) {
		System.out.println("className is "+ bottle.getItem().getClass().getName());
	}
//	private static void readOperation(Bottle<? extends OralMedicine> bottle) {
//		bottle.setItem(new Tablet());
//	}
	private static void writeOperation(Bottle<? extends OralMedicine> bottle) {
	OralMedicine or=bottle.getItem();
	System.out.println(or.getClass().getName());
	}
	
	
}
