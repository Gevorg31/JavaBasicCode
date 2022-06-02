package com.syntax.TeamWork;

import java.util.Scanner;

public class ScannerArrayNumber1Sum {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values.
		//After the Array is created, calculate the sum of all elements in that array.
		
		Scanner input = new Scanner(System.in); 
		// Entering first number
		System.out.println("Please enter your first number");
		// Initializing  num 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		// Initializing sum and assigning to 0
		int sum = 0;
		// Initializing Array values with num 
		int[]values = { num1, num2, num3, num4};
		// Using For Loop to find length
		for (int i = 0; i < values.length; i++) {
	    // Using 'sum' to find sum of num 
			sum+=values[i];
		}
			System.out.println("The sum of values is "+sum);

	}

}
