package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		// I want to store a prices in array
		// Arrays are fixed in size during runtime JAVA cannot increase or decrease a size of an array 
		double [] price = new double[4];
		
		price[0] = 1.99;
		price[1] = 1.92;
		price[2] = 3.44;
		price[3] = 4.55;
		
		System.out.println(price[2]);
		
	}

} 
