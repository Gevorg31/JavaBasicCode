package com.syntex.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 17;
		int weightLbs = 110;

		if (age == 18) {
			System.out.println("Age has been indentify");
			if (weightLbs >= 110) {
				System.out.println("Then he/she is eligible");
			} else {
				System.out.println("Otherwise we cannot accept such a patient");
			}

		}
	}
}
