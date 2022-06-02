package com.syntax.TeamWork;

import java.util.Scanner;

public class TaskNumber7NumberPrimeOrNot {

	public static void main(String[] args) {
		// Write a Java program to check whether a given number is prime or not?
		// Prime number is any whole number or integer, greater than 1 that is only divisible by 1 and itself.
		
		Scanner input = new Scanner(System.in);
		// Asking user to input number
		System.out.println("Please enter your number");
		// Initializing num
		int num = input.nextInt();
		
		// initializing prime and assigning to true (Boolean)
		boolean prime = true;
		
		// Using For Loop 
		for (int i = 2; i < num; i++) {
			// % mod operation
			if (num % i == 0) {
				prime = false;
				break;
				// Using If statement to find prime or not
			}
			
		}if (prime == true ) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}

	}

}
