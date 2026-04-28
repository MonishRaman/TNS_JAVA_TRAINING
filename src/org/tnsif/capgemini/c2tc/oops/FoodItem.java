package org.tnsif.capgemini.c2tc.oops;

public class FoodItem {

	//State or Properties
	String name; 
	double price;
	String category;
	
	//Behavior or Method or Member Function
	void display() {  
		System.out.println("Food Name: " + name);
		System.out.println("Food Price: " + price);
		System.out.println("Food Category: " + category);
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Object Creation
		FoodItem obj1 = new FoodItem();
		obj1.name = "Panner Burger";
		obj1.price = 200;
		obj1.category = "Fast Food";
		
		FoodItem obj2 = new FoodItem();
		obj2.name = "Panner Pizza";
		obj2.price = 250;
		obj2.category = "Italian";
		
		FoodItem obj3 = new FoodItem();
		obj3.name = "Cold Coffee";
		obj3.price = 150;
		obj3.category = "Beverage";
		
		FoodItem obj4 = new FoodItem();
		obj4.name = "Pancake";
		obj4.price = 300;
		obj4.category = "Desert";
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
	}

}
