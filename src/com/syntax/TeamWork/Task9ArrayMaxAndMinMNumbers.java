package com.syntax.TeamWork;

public class Task9ArrayMaxAndMinMNumbers {

	public static void main(String[] args) {
		// Find maximum and minimum number in the Array
		
		// initializing 'numbers' and assigning with numbers
		int[] numbers = {10,22,99,35,100,8,3,155};
		// Initializing max and min numbers and assigning 
		int maxNum = 0;
		int minNum = numbers[0];
		
		// Using For Loop
		for (int i = 0; i < numbers.length; i++) {
			// Using If condition to find max number
			if (maxNum < numbers[i]) {
				maxNum = numbers[i];
			}
		}
		System.out.println("The maximum number is "+maxNum);
		
		for (int i = 0; i < numbers.length; i++) {
			//  Using If condition to find min number
			if (minNum > numbers[i]) {
				minNum = numbers[i];
			}
			
		}
		System.out.println("The minimum number is "+minNum);
	}

}
