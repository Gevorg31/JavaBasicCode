package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {
		// how to create multiplication table
		
		for (int x = 1; x <= 10; x++) { // incrementing number +
			
			for (int y = 1; y <= 10; y++) {
				
				System.out.print(x+" x "+y+" = "+(x*y));
			}
		}

	}

} 
