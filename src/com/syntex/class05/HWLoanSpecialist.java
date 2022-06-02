package com.syntex.class05;

import java.util.Scanner;

public class HWLoanSpecialist {

	public static void main(String[] args) {
		
		System.out.println("What is the amount of loan is needed?");
		 Scanner input = new Scanner(System.in);
		
		 int loan = input.nextInt();
		
		if(loan<200000 || loan==200000) {
	       		System.out.println("I would lend the money");
		}else {
			System.out.println("I would reject the client");
		}

	}

}
