package org.tnsif.capgemini.c2tc.StaticDemo;

class StaticBlockDemo{
	void display() {
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		StaticBlockDemo st = new StaticBlockDemo();
		st.display();
	}

}
