
public class InstanceExample {
	/*
	 *instance method as normal methods of a class, you need to invoke them using an object of the class −
	 */
   public void demo(){
      System.out.println("instance method");
   }
   public static void main(String args[]){
	   InstanceExample test=  new InstanceExample();
	   test.demo();
   }
}
