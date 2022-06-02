package com.syntex.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
	
	/*
	 * we need to check if repl was completed
	 * 
	 * if repl is completed we want to see
	    * if you did 15 and more --> great job
	    * if you did more then 10 --> good job
	    * if less then 10--> try to complete  all assignments
	 */
		
		boolean didRepl=true;
		int assignments;
		
		if (didRepl) {
			System.out.println("How many assignments have you done");
			assignments=14;
			
			if (assignments>15 ) {
				System.out.println("You did a great job");
			}else if (assignments>10) {
				System.out.println("You did a good job");
			}else {
				System.out.println("Please complete all assignments");
			}
		}else {
			System.out.println("You should complete you Repl HW");
		}
	}
}
