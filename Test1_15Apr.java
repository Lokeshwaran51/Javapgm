package com.EB_15;
class Example{
	int rollno=101;
	String name="Lokesh";
	public void Test() {
		String address="Chennai";
		System.out.println(address);
	}
	static int age=21;
}

public class Test1_15Apr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Example A=new Example();
		System.out.println(A.rollno+" "+A.name);
		A.Test();
		System.out.println(Example.age);
		
	}

}
