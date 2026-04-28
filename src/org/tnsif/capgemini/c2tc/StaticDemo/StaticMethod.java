package org.tnsif.capgemini.c2tc.StaticDemo;

class PaymentGateway{
	static void showSupportdBank() {  //No need to create object for calling Static methods
		System.out.println("Supported Banks: SBI, HDFC, ICICI, Axis");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		PaymentGateway.showSupportdBank(); 
	}

}
