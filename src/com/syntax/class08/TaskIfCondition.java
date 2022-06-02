package com.syntax.class08;

public class TaskIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FOR we use when we know in advance how many times we have to repeat the block of codes 
		// WHICH we use when we don't know how many time we have to repeat the block of codes
		// while - executes the code when condition is true
		// do while - executes at least once the cod even is false condition

		// write a program to find sum of all even and all odd numbers from 1 to 70
		
		int sum = 0;
		
		for ( int i=1; i<=70; i++) {
			if (i % 2 == 0) {
				sum+=i;
				
			}
		}
		System.out.print(sum);
		
		System.out.println();
		
		int sum2 = 0;
		
		for (int i=1; i<=70; i++) {
			if (i % 2 != 0) {
				sum2+=i;
			}
			
		}
		System.out.print(sum2);
		
		System.out.println();
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 1; i <= 70; i++) {
			
			if (i % 2 == 0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		
		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
	}

}
