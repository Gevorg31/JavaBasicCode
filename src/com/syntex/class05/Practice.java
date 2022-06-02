package com.syntex.class05;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		  Scanner prompt = new Scanner(System.in);
		   System.out.println("Please enter two strings");
		   String word1, word2 ;
		   word1 = prompt.next();
		   word2 = prompt.next();
		      
		   System.out.println("Please enter two numbers");  
		   int int1, int2 ;
		   int1 = prompt.nextInt();
		   int2 = prompt.nextInt();   

		      if(int1 == int2 && word1 == word2) {
		        System.out.println("AND");
		      }else if(int1 == int2 || word1 == word2) {
		        System.out.println("OR");
		      }else if(int1 != int2 && word1 != word2) {
		        System.out.println("NONE");
		      }
		      prompt.close();
		      
		      }
		}
	