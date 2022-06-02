package com.syntex.class04;

public class NestedIf {

	public static void main(String[] args) {
		// "Nested If" - is the If with the other If
		
		/*
		 * if (boolean expression) { // outer iff
		 * code A:
		 * if (boolean expression) { //nested/inner
		 * codeB;
		 * }
		 * } // if outer if is False then we cannot run Nested if
		 */

		boolean vaccine = true;// declaration
		int dose = 2;// declaration
		
		if(vaccine) { // condition
			System.out.println("Let me check how many doses you have");
			
			if (dose == 1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		
		String month = "June";
		int day = 19;
		
		if (month.equals("May")) {
			System.out.println("let me check what is today's date");
			if (day == 8) { // nested if inside the other if and always has a dependency on the other if
				System.out.println("Today is Mother's day");
			}
		} else if (month.equals("June")) {
				System.out.println("Not Mothers's day");// nested if block inside of else if block
				if (day == 19) {
					System.out.println("Today is a Fathr's Day");
			}
		}
	}

}
