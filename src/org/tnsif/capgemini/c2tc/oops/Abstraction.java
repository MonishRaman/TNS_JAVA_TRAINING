package org.tnsif.capgemini.c2tc.oops;

abstract class Mahesh{
	public void calling() {
		System.out.println("Calling");
	}
	
	public abstract void AIIntegration();
	public abstract void SatteliteComm();
	public abstract void HearlthMonitoring();
}

abstract class Ramesh extends Mahesh{

	@Override
	public void AIIntegration() {
		System.out.println("Phone has AI Integration");
		
	}
	public abstract void SatteliteComm();
	public abstract void HearlthMonitoring();
}

class Suresh extends Ramesh{

	@Override
	public void SatteliteComm() {
		System.out.println("Phone has Satellite Communication");
	}

	@Override
	public void HearlthMonitoring() {
		System.out.println("Phone has Health Monitoring");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		Suresh obj = new Suresh();
		obj.calling();
		obj.AIIntegration();
		obj.SatteliteComm();
		obj.HearlthMonitoring();
	}

}
