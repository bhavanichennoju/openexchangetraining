package com.accessmodifiersprivate;
class Student{
	
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}



public class ExamplePrivateModifier {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("bhavani");
		student.setAddress("hitech");
		System.out.println(student );

	}

}
