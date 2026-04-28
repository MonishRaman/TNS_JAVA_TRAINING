package org.tnsif.capgemini.c2tc.FinalDemo;

class UPIApp{
	final int Max_DailyLimit = 10000; //Cannot be modified
	
	void showLimit() {
		System.out.println("Daily Transfer Limit: " + Max_DailyLimit);
	}
}

public class FinalVariable {

	public static void main(String[] args) {
		UPIApp obj = new UPIApp();
		obj.showLimit();
	}

}
