package com.syntex.class04;

public class Task2 {

	public static void main(String[] args) {

		int number = 10;

		if (number > -1) {
			System.out.println("Number is possitive");
		} else {
			System.out.println("Number is negative");
		}

		int a = -11;
		int b = 0;

		if (a > b) {
			System.out.println(a + "Number is possitive");	
		} else if (a==b) {
			System.out.println(a+" Number is not pisitive or negative"); // we are using ELSE IF when some of them match
		} else {
			System.out.println(a + " Number is negative then");// when none of conditions are true we are using ELSE
		}

	}

}
