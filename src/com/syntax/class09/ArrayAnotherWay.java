package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		
		String[] fruits = {"mango", "apple", "kiwi", "pear"};
		
		System.out.println(fruits[2]);
		//fruits[4] = "peach"; error Array is fixed 
		System.out.println("My favorite food is "+fruits[0]);
		
		int size = fruits.length; // to count all fruits 
		
		System.out.println(size);
		

	}
 
}
