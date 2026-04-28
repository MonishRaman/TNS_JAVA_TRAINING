package org.tnsif.capgemini.c2tc.constructor;

class User2{
	String name;
	int age;
	
	User2(String name, int age){   //Parameterized Constructor    
		this.name = name;
		this.age = age;
		System.out.println("Name: " + name + "\nAge: " + age);
	}
	
//	User2(String n, int a){   //Parameterized Constructor - without using this keyword   
//		name = n;
//		age = a;
//		System.out.println("Name: " + name + "\nAge: " + age);
//	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		User2 user = new User2("Kunal",21);
	}

}
