package com.syntex.class05;

import java.util.Scanner;

public class HWQuizMidTermFinalScore {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Quiz score");
		int quiz = input.nextInt();
		System.out.println("Enter your Mid-term score");
		int mid = input.nextInt();
		System.out.println("Enter your Final score");
		int finalS = input.nextInt();
		
		int everegeScore = ((quiz+mid+finalS)/3);
		
		if (everegeScore >= 90) {
			System.out.println("Your grade is A");
		}else if(everegeScore>=70 && everegeScore<=90) {
			System.out.println("Your grade is B");
		}else if(everegeScore>=50 && everegeScore<=70) {
			System.out.println("Your grade is C");
		}else if(everegeScore<50) {
			System.out.println("Your grade is F");
		}
		

	}

}
