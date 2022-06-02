package com.syntex.class06;

import java.util.Scanner;

public class HWcountryLenguage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your country");
		String country, language;
		
		country = input.nextLine();
		
		switch ("Russia") {
			
		case "Russia":
			language = "Russian";
			break;
		case "Armenia":
			language = "Aemenian";
			break;
		case "USA":
			language = "English";
			break;
		case "Ukraine":
			language = "Ukrainian";
			break;
		default:
			language = "Unknown";
		
		}
		
		System.out.println("You are from "+country+" you speak in "+language);
	}

}
