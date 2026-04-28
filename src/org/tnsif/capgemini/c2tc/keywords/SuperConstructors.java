package org.tnsif.capgemini.c2tc.keywords;

class Animal1{
	Animal1(){
		System.out.println("Animal Constructor");
	}
}

class Cat1 extends Animal1{
	Cat1(){
		super();
		System.out.println("Dog Constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {
		Cat1 cat = new Cat1();
	}
}
