package org.tnsif.capgemini.c2tc.oops;

class Device{
	void deviceType() {
		System.out.println("I am an Electronic Device");
	}
}

class Phone extends Device{
	void brand() {
		System.out.println("Brand: Redmi");
	}
}

class SmartPhone extends Phone{
	void features() {
		System.out.println("Features: TouchScreen, Camera, Internet");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.deviceType();
		sp.brand();
		sp.features();
	}

}
