package com.syntex.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * declare 2 number and verify which one is larger than the other one. the
		 * moment Java finds true condition it execute that bloc and exit entire if
		 * condition
		 */

		int num1 = 20;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println(num1 + " is the larger than " + num2);

		} else if (num2 > num1) {
			System.out.println(num2 + " is the larger than " + num1);// to test multiple conditions Java gives us else
																		// if block

		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		int day = 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");

		}

	}

}
