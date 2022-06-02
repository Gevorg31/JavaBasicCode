package com.syntex.class06;

import java.util.Scanner;

public class HWValuseForSales {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/
		
		System.out.println("Please enter value for sale");
		String answer1 = "yes";
		answer1 = input.next();
		String answer2 = "no";
		answer2 = input.next();
		int num;
		char $;
		
		if (answer1 == "yes") {
			System.out.println("Which item you want to buy?");
			System.out.println("How much?");
		}

	}

}
