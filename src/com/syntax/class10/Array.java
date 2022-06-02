package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		/* Array - container object that consist of values of same type
		 * Array - is a java data structure
		 * Elements stored based on indexes. Starts from 0
		 * Array is fixed in size!
		 */
		
		String[] disney = {"Shrek", "Elsa", "Goofy", "Mulan"};
		int size = disney.length;
		System.out.println(size);
		System.out.println(disney[1]);
		
		System.out.println();
		
		
		String[] iceCream = new String[3];
		iceCream[0] = "butter pecan";
		iceCream[1] = "chocolate";
		
		System.out.println(iceCream[2]); // null with String
		 

	}

}
