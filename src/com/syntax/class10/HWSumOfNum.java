package com.syntax.class10;

public class HWSumOfNum {

	public static void main(String[] args) {

		// Create a 2D array of integer values. Print the sum of all numbers.

		// Declaration of 2D Array
		int[][] values = { { 10, 20, 30, 40 }, { 11, 22, 33, 44, }, {50,60,70,80}, {51,61,71,81} };
		// Initializing variable sum
		int sum = 0;
		// Nested For Loop to read all elements of the Array
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				//sum i+j
				sum+=values[i][j];
			}
		}

		System.out.println("The sum of intered values is "+sum);

	}
}
