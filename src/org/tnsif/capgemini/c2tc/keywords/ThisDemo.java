package org.tnsif.capgemini.c2tc.keywords;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.setName("Alice");
		obj.setAge(20);
		obj.displayDetails();
		
		obj.setName("Jacob");
		obj.setAge(22);
		obj.displayDetails();
	}

}
