package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 10;

		if (time < 12) {
			System.out.println("Morning");
		}

		while (time < 12) { // this loop is infinite
			System.out.println("Morning");
			time++;
		}
		
		System.out.println("Hello");

	}

}
