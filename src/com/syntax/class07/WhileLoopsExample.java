package com.syntax.class07;

public class WhileLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print numbers from 1 to 10;

		int num = 1;
		while (num <= 10) {
			System.out.print(num + " "); // Concatenation operator
			num++; // increment
		}

		int a = 10;

		while (a <= 100) {
			System.out.print(a + " ");
			a++;

		}

		int b = 10;

		while (b >= 1) {
			System.out.println(b + " ");
			b--;
		}

		int c = 100;
		while (c >= 50) {
			System.out.println(c + " ");
			c--;
		}

		int d = -1;
		while (d >= -10) {
			System.out.println(d + " ");
			d--; // d=d-1
		}

		int e = 1;

		while (e <= 20) {
			System.out.println(e + " ");
			e += 2; // e=e+2 and e+=2 short hand for even numbers
		}

		int f = 1;

		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.println(f + " ");
			}
			f++;
		}

		int num1 = 20;

		while (num1 <= 100) { // numbers are odd
			System.out.print(num1 + " ");
			num1 += 2;
		}
		System.out.println();

		int num2 = 100;

		while (num2 >= 1) {
			if (num2 % 2 != 0) { // numbers are even
				System.out.print(num2 + " ");
				num2--;

			}

		}

	}

}
