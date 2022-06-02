package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i need to print numbers from 1 to 90

		for (int i = 1; i <= 90; i++) {
			System.out.print(i + " ");
		}

		/*
		 * start point end point increment/decrement
		 */

		// i need numbers from 60 to 10
		System.out.println();

		for (int i = 60; i >= 10; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Print even numbers from 20 to 1 (2ways)
		// Print odd numbers between 20 and 50 (2ways)

		System.out.println();

		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {	
			}System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 21; i <= 50; i+=2) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 21; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			}
		System.out.println();
		
		// int, boolean double - declaration 
		// i=1; a=b; - initialization
	}
	}


