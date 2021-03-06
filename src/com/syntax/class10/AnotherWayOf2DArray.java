package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		/*
		 * 1 array -> NY->all cities of NY state
		 * 2 array -> CA -> all cities of CA state
		 * 3 array -> FL -> all cities of FL state
		 * 4 array -> VA -> all cities of VA state
		 */

		String[][] usa = {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}		
				
		};
		
		System.out.println(usa[1][2]);
		System.out.println("I want to go to "+usa[2][0]);
		System.out.println("Total # of 1D arrays in array usa = "+usa.length);
		
		// i want to see how many elements in my first array
		
		int elem1array = usa[0].length;
		System.out.println("Number of elements in 1 array = "+elem1array);
		
		// i want to see how many elements in my second array
		
		int elem2array = usa[1].length;
		System.out.println("Number of elements in 2 array = "+elem2array);
		
		// i want to see how many elements in my third array
		
		int elem3array = usa[2].length;
		System.out.println("Number of elements in 3 array = "+elem3array);
	}
 
}
