package org.tnsif.capgemini.c2tc.oops;

class AnimalClass{
	void sound() {
		System.out.println("Animals can make sound");
	}
}

class Lion extends AnimalClass{
	void sound() {
		System.out.println("Lion roars.....");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		AnimalClass ani = new AnimalClass();
		ani.sound();                             //Animals can make sound
		
		Lion l = new Lion();
		l.sound();                               //Lion roars.....
		
		AnimalClass anim = new Lion();
		anim.sound();                            //Lion roars.....
	}

}
