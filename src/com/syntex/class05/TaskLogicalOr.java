package com.syntex.class05;

import java.util.Scanner;

public class TaskLogicalOr {

	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter your high");
     
     int num = input.nextInt();
    
     
     if (num<60) {
    	 System.out.println("short");
     }else if (num>=60 && num<=72) {
    	 System.out.println("medium");
     }else if (num>72) {
    	 System.out.println("tall");
     }
	}

}
