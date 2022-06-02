package com.syntex.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		// >, <, >=, <=, ==, !=

		int num1 = 20;
		int num2 = 22;
		System.out.println(num1 > num2);// false
		System.out.println(num1 < num2);// true
		System.out.println(num1 != num2);// true

		System.out.println(num1 == num2);// false
		System.out.println(num1 = num2);// reassigning the operator num1 to num2 =22

		System.out.println(num1 == num2);// true we did reassign line number 16

		boolean result = 100 > 200;
		System.out.println(result); // using relational operator ( true or false )

		int result1 = 100 + 200;
		System.out.println(result1); // using arithmetic operator

		String result2 = "Emre" + 10;
		System.out.println(result2); // using string ""

		int num3 = 10;
		int num4 = 11;

		result = num3 == num4;
		System.out.println(result);// false num3 equal to num4

		result = num3 != num4;
		System.out.println(result);// true num3 NOT equal to num4

	}

}
