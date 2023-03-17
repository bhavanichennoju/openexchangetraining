//parent 
class Calculation {
   int results;
	
   public void addition(int a, int b) {
	   results = a + b;
      System.out.println("The sum of the given numbers:"+results);
   }
	
   public void Subtraction(int a, int b) {
	   results = a - b;
      System.out.println("The difference between the given numbers:"+results);
   }
   
   public void welcome() {
      System.out.println("welcome home");
   }
}
//derived
public class CalculationMain extends Calculation {
   public void multiplication(int a, int b) {
      results = a * b;
      System.out.println("The product of the given numbers:"+results);
   }
   
   public void welcome() {
	   super.welcome();
	      System.out.println("welcome sweet home");
	   }
   //main
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      CalculationMain demo = new CalculationMain();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
      demo.welcome();
   }
}