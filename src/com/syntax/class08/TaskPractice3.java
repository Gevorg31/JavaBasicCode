package com.syntax.class08;

public class TaskPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
