package org.tnsif.capgemini.c2tc.keywords;

class Animals{
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animals{
	void makeSound() {
		super.makeSound();
		{
			System.out.println("Dog Barks");
		}
	}
}
 
public class SuperMethod {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.makeSound();
	}
}
