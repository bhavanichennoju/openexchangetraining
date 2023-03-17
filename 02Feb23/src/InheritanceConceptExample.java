import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ParentMethod {
	
	void welcome() {
		System.out.println("hello");
	}

}
 class ChildMethod extends ParentMethod {
	
	void welcome() {
	//	super.welcome();
		System.out.println("hello sweet home");
	}
//	  void greeting() {
//		  System.out.println("good evng");
//	  }

}
 public class InheritanceConceptExample { 
		public static void main(String[] args) {
			ParentMethod cm=new ChildMethod();
			cm.welcome();
		

			
		}
	}
