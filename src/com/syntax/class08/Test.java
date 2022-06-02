package com.syntax.class08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("Print number");
		  int end;
		  end = input.nextInt();
		  
		  for (int i=0; i<=end; i++) {
		    System.out.print(i+" ");
		  }
		 }
		}