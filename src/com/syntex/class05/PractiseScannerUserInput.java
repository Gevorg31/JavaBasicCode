package com.syntex.class05;

import java.util.Scanner;

public class PractiseScannerUserInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter name");
		String name = scan.nextLine();// capture string
		System.out.println(name);
		System.out.println("Please enter age");
		int age = scan.nextInt();// capture Int
		System.out.println(age);
		System.out.println("Please enter price");
		double price = scan.nextDouble(); // capture double
		System.out.println(price);
		System.out.println("Please enter boolean");
		boolean boo = scan.nextBoolean();
		System.out.println(boo);
		System.out.println("Enter any character");
		char character = scan.next().charAt(0); // capture 1 character
		System.out.println(character);

	}

}