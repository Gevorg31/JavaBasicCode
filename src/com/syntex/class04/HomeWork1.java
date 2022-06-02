package com.syntex.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		System.out.println("Print First Name");
		String name = user.next();

		System.out.println("Print Last Name");
		String lastName = user.next();

		System.out.println("Please provide state where do you live");
		String state = user.next();

		System.out.println(name + " " + lastName + " from state " + state);
	}

}
