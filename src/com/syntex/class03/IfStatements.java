package com.syntex.class03;

public class IfStatements {

	public static void main(String[] args) {
		/*
		 * declare a variable rate. If rate is more than 5--> I am not buyin a house
		 */

		double mortgageRate = 5.5;
		if (mortgageRate > 5)
			;
		{ // no curly brackets when if is not greater then any variable or condition is
			// true

			System.out.println("I am not buying a house");
		}

		double mortgageRate1 = 4.5;
		if (mortgageRate1 > 5)
			; // when condition if false no curly brackets

		System.out.println("I am not buying a house");

		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */

		int num1 = 99;
		int num2 = 10;

		if (num1 > num2) { // true we can use curly brackets
			System.out.println(num1 + " is bigger then " + num2);
		}

		/*
		 * declare temperature, if temperature i higher than 75-> i will go a walk
		 */

		int temp = 68;
		if (temp > 75) { // boolean condition true or false
			System.out.println("I will go for a walk");
		} else { // Otherwise code comes to else{}
					// When condition is false
			System.out.println("I am going to study Java");
		}

		char gender = 'f';
		if (gender == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");
		}

		char gender1 = 'm';
		if (gender1 == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");
		}

		String browser = "chrome";
		if (browser.equals("chrome")) { // true with String we going to use .equals
			System.out.println("All test will be executed on chrome");
		} else {
			System.out.println(" I am executing any test cases");
		}

		String browser1 = "Chrome";
		if (browser1.equals("chrome")) { // false in String everything meter UpperCase
			System.out.println("All test will be executed on chrome");
		} else {
			System.out.println("I am executing any test cases");
		}

		String pen = "Red";
		if (pen.equals("red")) {
			System.out.println("It will match her dress");
		} else {
			System.out.println("Want match her dress");
		}

		String pen2 = "Red";
		if (pen2.equals("Red")) {
			System.out.println("It will match her dress");
		} else {
			System.out.println("Want match her dress");
		}
		char letter = 'j';
		if (letter == 'j') {
			System.out.println("Should appear letter J");

		} else {
			System.out.println("Sholdn't appear letter J");
		}

		char letter1 = 'j';
		if (letter1 == 'f') {
			System.out.println("Should appear letter J");

		} else {
			System.out.println("Sholdn't appear letter J");
		}

		char computers = 10;
		if (computers > 10) {
			System.out.println("Correct amount of computers was shipped");
		} else {
			System.out.println("incorrect amount of computers was shipped");
		}

		char computers1 = 9;
		if (computers1 > 8) {
			System.out.println("Correct amount of computers was shipped");
		} else {
			System.out.println("incorrect amount of computers was shipped");
		}

		String apple = "Green";
		if (apple.equals("Green")) {
			System.out.println("All apples in basket green");
		} else {
			System.out.println("Some apples in basket yellow");
		}
		String apple1 = "Green";
		if (apple1.equals("Yellow")) {
			System.out.println("All apples in basket green");
		} else {
			System.out.println("Some apples in basket yellow");
		}

		int samsung=321;
		if (samsung==321) {
			System.out.println("True");
		}else {
			System.out.println("False");
			
		}
		
		int samsung1=321;
		if (samsung1!=321) {
			System.out.println("True");
		}else {
			System.out.println("False");
			
		}
	}
}
