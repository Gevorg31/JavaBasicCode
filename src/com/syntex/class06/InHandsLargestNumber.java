package com.syntex.class06;

public class InHandsLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 200;
		int num2 = 200;
		int num3 = 20;
		int largest = 0; // 1. creating variable 2. assigning or initializing the variable "largest"
		
		/*
		 * compiler can initialize variables to it's default values
		 * int -> 0
		 * double -> 0.0
		 * boolean -> false
		 * String -> null
		 */
		 
		if (num1 >= num2 && num1 >= num3) {
			largest = num1; // Initializing the variable
		} else if (num3 >= num1 && num3 >= num2) {
			largest = num3; //Reassigning the variable
		} else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
		}else {
			System.out.println("All numbers are equal");
		}
		
		if (largest!=0) {
			System.out.println("The largest number is "+largest); // Concatenation
		}
		
	}

}
