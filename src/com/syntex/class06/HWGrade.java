package com.syntex.class06;

import java.util.Scanner;

public class HWGrade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		
		char grade; 
		String  explanation;
		
		grade = input.next().charAt(0);
		
		switch (grade) {
		
		case 'A':
			explanation = "Exelent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = " Not Acceptable";
		}
		System.out.println("Your grade is "+grade+"-"+explanation);
	}

}
