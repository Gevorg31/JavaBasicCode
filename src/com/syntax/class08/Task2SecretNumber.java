package com.syntax.class08;

import java.util.Scanner;

public class Task2SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * declare a secret number you want to ask a user to guess your secret number
		 * you code should keep asking to guess until user your secret number once user
		 * gets the secret number -> you got it
		 */

		Scanner ask = new Scanner(System.in);

		int secretNumber = 333;
		int guessedNumber;

		do {
			System.out.println("Please enter my secret number");
			guessedNumber = ask.nextInt();
		} while (guessedNumber != secretNumber);

		System.out.println("You got it");
	}

}
