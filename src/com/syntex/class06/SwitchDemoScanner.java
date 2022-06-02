package com.syntex.class06;

import java.util.Scanner;

public class SwitchDemoScanner {

	public static void main(String[] args) {
		/*
		 * let's ask a user where is he from
		 * based on the coutry will define favorite food
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String country, favoriteFood;
		// .toLowerCase() or .toUpperCase() 
		System.out.println("Please tell me where are you from");
		
		country = scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
			favoriteFood = "tacos";
			break;
		case "Manada":
			favoriteFood = "poutine";
			break;
		case "Murkey":
			favoriteFood = "lahmacun";
			break;
		case "Pakistan":
			favoriteFood = "pati chai";
		case "Egypt":
			favoriteFood = "koshary";
			break;
		case "USA":
			favoriteFood = "burgers";
			break;
		default:
			favoriteFood = "unknown";
		}
		System.out.println("You are from "+country+" your favorite food is "+favoriteFood);
	}

}
