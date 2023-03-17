package generic;

public class LowerBoundsExampleSuper {
	public static void main(String[] args) {
		logDetailOfClass(new Bottle<OralMedicine>(new OralMedicine()));
		logDetailOfClass(new Bottle<Medicine>(new Medicine()));
		logDetailOfClass(new Bottle<HumanMedicine>(new HumanMedicine()));
		writeOperation(new Bottle<Medicine>());

	}
	private static void logDetailOfClass(Bottle<? super OralMedicine> bottle) {
		System.out.println("className is "+ bottle.getItem().getClass().getName());
	}
	private static void writeOperation(Bottle<? super OralMedicine> bottle) {
		bottle.setItem(new Capusule());
		System.out.println(bottle.getItem().getClass().getName());
	}
//	private static void redOperation(Bottle<? super OralMedicine> bottle) {
//		OralMedicine or=bottle.getItem();
//	System.out.println(or.getClass().getName());
//	} 
}
