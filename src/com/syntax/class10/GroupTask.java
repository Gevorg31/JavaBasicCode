package com.syntax.class10;

public class GroupTask {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] number = { 10, 20, 30, 40, };
		int max = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("The largest number is " + max);

		System.out.println();

		max = number[0];
 
		for (int num : number) {
			if (num > max) {
				max = num;
			}
		}
	}

}
