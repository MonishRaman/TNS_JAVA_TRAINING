package org.tnsif.capgemini.c2tc.javabasics;

public class VariableDemo {
	
	int price = 10;    //Instance Variable
	
	void print() {
		String msg = "Hello World";   //Local Variable
		System.out.println(msg);
	}
	
	static String message = "Hello Students";    //Static Variable

	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		System.out.println("The value of Price: " + obj.price);
		obj.print();
		System.out.println(message);
	}

}