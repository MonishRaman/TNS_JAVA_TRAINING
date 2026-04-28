package org.tnsif.capgemini.c2tc.constructor;

class User1{
	String name;
	int age;
	
	User1(){   //Default Constructor - no parameters
		name = "Kunal";   //Default Values
		age = 21;
		System.out.println("Name: " + name + "\nAge: " + age);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		User1 user = new User1();
	}

}
