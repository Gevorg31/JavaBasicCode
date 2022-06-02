package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();

		int num1 = 1;
											 
		do {                                // do not check the condition either it is true or false
			System.out.print(num1 + " "); // executes at list one time
			num1++;
		} while (num1 <= 3);
		System.out.println();
		// while loop first checks condition and only then executes block of code
		// do while first executes the code and only then checks the condition
		
		// print numbers 1 to 30 using do while 
		
		int a = 1;
		
		do {
			System.out.print(a+" ");
			a++;  // Incrementing 
		}while (a<=30); 
		
		System.out.println();
		
		// print numbers from 70 to 40 even numbers
		
		int b = 70 ;
		do {
			System.out.print(b+" ");
			b-=2; // decrementing
		}while (b>=30);
		
		System.out.println();
		
		
	}

}
