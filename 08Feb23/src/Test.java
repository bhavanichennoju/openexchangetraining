public class Test {
    {
        System.out.println("Empty block");//The empty block is executed whenever you instantiate your class
    }
    static {
        System.out.println("Static block");//The static block is executed whenever your class loads
    }
    
    Test(){
    	System.out.println("test method");
    	method1();
    }
    
    public void method() {
    	System.out.println("general method");
    }
    public static void method1() {
    	System.out.println("static  method");
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("mainblock");
        t.method();
      //  method1();

    }
}