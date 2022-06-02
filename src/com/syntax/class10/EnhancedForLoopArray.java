package com.syntax.class10;

public class EnhancedForLoopArray {

	public static void main(String[] args) {
		// enhanced for loop uses variables to access elements from an array
		// outer for loop -> iterates over 1D array
		// outer loop -> iterates over elements of each 1D array

		int[][] nums = {
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787}	
		};
		
		for (int[] num:nums) { // nums is name for 2D array 
			
			for(int n:num) { //num is name for 1D array
				
				System.out.print(n+" ");
				
			}
		}
	}

}
