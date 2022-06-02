package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// Nested loop inside another loop

		for (int i = 1; i <= 3; i++) { // outer loop should be true then we can execute nested loop
			System.out.println("Hello");
			for (int y = 1; y <= 2; y++) { // nested loop
				System.out.println("Bye");
			}
		}

	} 

}
