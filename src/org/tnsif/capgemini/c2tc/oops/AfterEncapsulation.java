package org.tnsif.capgemini.c2tc.oops;

class Humans{
	private int age;
	private String name;
	
	//Setters and Getters - Right click inside class -> Source -> Generate Getters and Setters
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class AfterEncapsulation {

	public static void main(String[] args) {
		//For Encapsulation, make use of access specifier private
		//using setters and getters method we can get the value of variable
		
		Humans hum = new Humans();
		hum.setAge(22);
		hum.setName("Aryaman");
		System.out.println("Name: " + hum.getName());
		System.out.println("Age: " + hum.getAge());
		System.out.println();
		
		hum.setAge(25);
		hum.setName("Parth");
		System.out.println("Name: " + hum.getName());
		System.out.println("Age: " + hum.getAge());
	}

}
