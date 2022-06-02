package com.syntax.class09;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TEnhanced for loop / advanced for loop / for each loop
		// CAN BE USED ONLY WHEN WE WORK WITH ARRAY OR COLLECTIONS
		
		
		String[] colors = {"pink", "blue", "white", "black"};
		
		for (String color:colors) {
			
			System.out.print(color+" ");
		}
		
		System.out.println();
		
		int[] numbers = {10, 20, 30, 40};
		
		for (int number:numbers) {
			
			System.out.print(number+" ");
		} 

	}

}
