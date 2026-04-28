package org.tnsif.capgemini.c2tc.StaticDemo;

class User3{
	String userName;
	static String appName = "Insta"; //shared among all users
	
	User3(String userName){
		this.userName = userName;
	}
	
	void showDetails() {
		System.out.println("User: " + userName + "\nApp: " + appName);
		System.out.println();
	}
}

public class staticVariable {

	public static void main(String[] args) {
		User3 u1 = new User3("Aman");
		User3 u2 = new User3("Arjun");

		u1.showDetails();
		u2.showDetails();
	}

}
