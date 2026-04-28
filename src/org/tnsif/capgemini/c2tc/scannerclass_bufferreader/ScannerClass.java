package org.tnsif.capgemini.c2tc.scannerClass_bufferReader;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your Age: ");
		String age = input.nextLine();
		
		System.out.println("Name: " + name);
		System.out.println("Age: "+ age);
		
		input.close();
	}

}
