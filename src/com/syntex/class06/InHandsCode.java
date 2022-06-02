package com.syntex.class06;

import java.util.Scanner;

public class InHandsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Quiz score");
		int quiz = input.nextInt();
		System.out.println("Enter your Mid-term score");
		int mid = input.nextInt();
		System.out.println("Enter your Final score");
		int finalS = input.nextInt();

		int everegeScore = ((quiz + mid + finalS) / 3);

		char grade;

		if (everegeScore >= 90) {
			grade = 'A';
		} else if (everegeScore >= 70 && everegeScore <= 90) {
			grade = 'B';
		} else if (everegeScore >= 50 && everegeScore <= 70) {
			grade = 'C';
		} else {
			grade = 'F';

		}

		System.out.println("Your are a " + grade + " student");

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are doing great");
		} else {
			System.out.println("Please study more");
		}
	}

}
