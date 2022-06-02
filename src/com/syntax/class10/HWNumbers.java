package com.syntax.class10;

public class HWNumbers {

	public static void main(String[] args) { // regular loop
		int[] numbers = {10, 20, 30, 40};
		int sum = 0;
		for (int i = 0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements = "+sum);
		
		sum = 0;
		
		for(int num:numbers) { // inheands for loop
			sum+=num;
		}
		System.out.println("Sum of all elements = "+sum);
	}

}
