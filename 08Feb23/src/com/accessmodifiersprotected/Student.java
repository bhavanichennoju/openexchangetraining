package com.accessmodifiersprotected;

 class Example {
	 protected void method() {
		 System.out.println("protected method");
		
	}
}
public class Student {
		public static void main(String[] args) {
			Example st=new Example();
			st.method();			
		}

}
