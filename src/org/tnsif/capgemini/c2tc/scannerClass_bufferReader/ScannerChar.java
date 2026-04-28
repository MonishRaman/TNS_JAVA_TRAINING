package org.tnsif.capgemini.c2tc.scannerClass_bufferReader;

import java.util.Scanner;

public class ScannerChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		char c = input.nextLine().charAt(2);
		
		System.out.println("The third character of the input String is: " + c);
		
		input.close();
	}

}
