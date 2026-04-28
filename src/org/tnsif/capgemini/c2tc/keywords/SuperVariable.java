package org.tnsif.capgemini.c2tc.keywords;

class Animal{
	String name = "Animal";
}

class Dog extends Animal{
	String name = "Dog";
	
	void displayName() {
		System.out.println("Superclass Name: " + super.name);
		System.out.println("Subclass Name: " + name);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.displayName();
	}
}
