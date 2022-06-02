package com.syntex.class06;

import java.util.Scanner;

public class HWScannerCalculator {

	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner cal = new Scanner(System.in);

		System.out.println("Please enter your 2 numbers");

		int x = cal.nextInt();
		int y = cal.nextInt();
		char operator = cal.next().charAt(0);

		int result = 0;

		if (operator == '+') {
			result = (x + y);
		} else if (operator == '-') {
			result = (x - y);  
		} else if (operator == '/') {
			result = (x / y);
		} else if (operator == '*') {
			result = (x * y);
		}
		System.out.println(x + " " + operator + " " + y + " = " + result);
		//==================================================================================================
		int x1 = cal.nextInt();
		int y1 = cal.nextInt();
		System.out.println("Please enter your operator");
		char operator1 = cal.next().charAt(0);

		double result1 = 0;

		switch (operator1) {

		case '+':
			result = (x1 + y1);
			break;
		case '-':
			result = (x1 - y1);
			break;
		case '/':
			result = (x1 / y1);
			break;
		case '*':
			result = (x1 * y1);
		default:
			System.out.println("Invalid operator");

		}
		System.out.println(x + " " + operator + " " + y + " = " + result1);
		cal.close();
	}

}
