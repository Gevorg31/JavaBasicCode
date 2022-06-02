package com.syntax.class10;

public class ArrayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String[][] usa = {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}		
				
		};
     
     	for (String[] state:usa) {
     		
     		for(String city:state) {
     			
     			System.out.print(city+" ");
     		}
     	}
 
	}

}
