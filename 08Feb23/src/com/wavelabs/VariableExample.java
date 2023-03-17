package com.wavelabs;

public class VariableExample{
	public static int staticvariable;//static variable
	int instancevariable;//instance variable
	public void printValue(){
		int localvariable = 10;//local variable
		System.out.println("static variable   "+ staticvariable);
		System.out.println("instance variable  "+ instancevariable);
		System.out.println(" local variable   "+ localvariable);
	}
	public static void main(String args[]){
		VariableExample object=new VariableExample();
		object.printValue();
	}
}