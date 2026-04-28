package org.tnsif.capgemini.c2tc.oops;

public class MethodOverloading {

	int addition(int a, int b) {
		return a+b;
	}
	
	float addition(float a, float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("Addition of int: " + obj.addition(5, 10));
		System.out.println("Addition of float: " + obj.addition(6.1f, 10.3f));
	}

}
