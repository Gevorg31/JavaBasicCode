package com.syntex.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
System.out.println("Print your birth month");
		
		String month = input.next();
		String season;
		
		if(month.equalsIgnoreCase ("March") || month.equalsIgnoreCase ("April") || month.equalsIgnoreCase ("May")) {
			season = "Spring";
		}else if(month.equalsIgnoreCase ("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase ("August")) {
			season = "Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase ("October") || month.equalsIgnoreCase ("November")) {
			season = "Autumn";
		}else if (month.equalsIgnoreCase ("December") || month.equalsIgnoreCase ("January") || month.equalsIgnoreCase ("February")) {
			season = "Winter";
		}else {
			season = "Invalid";
		}
		
		if (!season.equals("Invalid")) { // if we don't want to print any thing
			System.out.println("you are born in "+season);
		}
		
	}

}
