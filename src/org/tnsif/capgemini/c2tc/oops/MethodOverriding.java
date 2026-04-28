package org.tnsif.capgemini.c2tc.oops;

class Payment{
	void makePayment() {
		System.out.println("Processing payment using generic method");
	}
}

class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using UPI");
	}
}

class CardPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using Credit/Debit card");
	}
}

class WalletPayment extends Payment{
	void makePayment() {
		System.out.println("Payment made using Digital Wallet");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Payment payment;    //Reference of Parent Class
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WalletPayment();
		payment.makePayment();
	}

}
