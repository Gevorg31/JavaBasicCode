package com.syntex.class04;

public class Diploma {

	public static void main(String[] args) {

		Boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulations");
			if (gpa == 3.5) {
				System.out.println("You are aligible for schoolarship");
			} else if (gpa <= 3.3) {
				System.out.println("You shold have studied harder");
			}

		} else {
			System.out.println("Get a degree");
		}

	}

}
