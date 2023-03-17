package com.accessmodifierspublic;
class Example{
	public String name;
	public void method() {
		System.out.println("method");
		System.out.println(name);
	}
}


public class ExamplePublic {

	public static void main(String[] args) {
		Example example =new Example();
		example.name="bhavani";
		example.method();

	}

}
