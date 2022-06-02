package com.syntex.class05;

import java.util.Scanner;

public class HWHisHers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Print your birth month");
		
		String month = input.next();
		
		if(month.equalsIgnoreCase ("March") || month.equalsIgnoreCase ("April") || month.equalsIgnoreCase ("May")) {
			System.out.println("You were born is season Spring");
		}else if(month.equalsIgnoreCase ("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase ("August")) {
			System.out.println("You were born is season Summer");
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase ("October") || month.equalsIgnoreCase ("November")) {
			System.out.println("You were born is season Autumn");
		}else if (month.equalsIgnoreCase ("December") || month.equalsIgnoreCase ("January") || month.equalsIgnoreCase ("February")) {
			System.out.println("You were born is season Winter");
		}

	}

}
