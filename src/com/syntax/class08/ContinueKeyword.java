package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// continue - skips current execution/iteration
		
		// when Java executes continue -> goes back to the beginning of the loop, so rest of the code inside loop body will be skipped/ignored
		
		for (int i=1; i<=5; i++) {
			
			if (i==2) {
			
			continue; // Ignores rest of the cod and continues 
			
			}
			
			System.out.print(i+" ");
		}
		
		System.out.println();

		// print numbers from 1 to 10 except number 5 and 7
		
		for (int i=1; i<=10; i++) {
			
			if (i==5 || i==7 ) {
				
				continue;
			}
			
			System.out.print(i+" ");
		}
	}

}
