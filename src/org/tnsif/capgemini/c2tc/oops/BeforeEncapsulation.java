package org.tnsif.capgemini.c2tc.oops;

class Human{
	int age;
	String name;
}

public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human human = new Human();
		human.age = 21;
		human.name = "Akash";
//		System.out.println("Name: " + human.name);
//		System.out.println("Age: " + human.age);
		
		//Over-riding
		human.age = 22;
		human.name = "Neha";
		System.out.println("Name: " + human.name);
		System.out.println("Age: " + human.age);
	}

}
