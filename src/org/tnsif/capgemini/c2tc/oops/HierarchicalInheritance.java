package org.tnsif.capgemini.c2tc.oops;

class Employee{
	void company() {
		System.out.println("Company: MicroSoft");
	}
}

class Developer extends Employee{
	void role() {
		System.out.println("Role: Software Developer\n");
	}
}

class Programmer extends Employee{
	void role() {
		System.out.println("Role: Program Specialist\n");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.company();
		dev.role();
		
		Programmer pgm = new Programmer();
		pgm.company();
		pgm.role();

	}

}
