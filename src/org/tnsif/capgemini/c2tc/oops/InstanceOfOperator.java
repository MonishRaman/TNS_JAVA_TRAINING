package org.tnsif.capgemini.c2tc.oops;

class Animal2{
	
}

class Dog extends Animal2{
	
}

class Cat{
	
}

public class InstanceOfOperator {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog instanceof Dog);      //true
		System.out.println(dog instanceof Animal2);	 //true
//		System.out.println(dog instanceof Cat);    //compile time error: Dog and Cat classes are not related 
	}
}
