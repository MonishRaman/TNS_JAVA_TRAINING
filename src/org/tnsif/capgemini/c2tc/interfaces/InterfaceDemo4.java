package org.tnsif.capgemini.c2tc.interfaces;

interface Vehicle7{
	void start();
	void stop();
}

interface Electrivehicle extends  Vehicle7{
	void chargeBattery();
}

class Tesla implements Electrivehicle{

	@Override
	public void start() {
		System.out.println("Vehicle is starting..");
		
	}

	@Override
	public void stop() {
		System.out.println("Vehicle is stopping..");
		
	}

	@Override
	public void chargeBattery() {
		System.out.println("Battery is charging..");
		
	}
	
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		Tesla tesla=new Tesla();
		tesla.start();
		tesla.stop();
		tesla.chargeBattery();
	}
}