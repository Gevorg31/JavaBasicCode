package com.syntax.class07;

public class IncrementDicrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x = 10;
	
	x= x+1;
	
	x+=1; // short hand operator
	
	System.out.println(x);
	
	x++; // increments value of a variable by 1
	System.out.println(x); //13

	x--; // decrement value of a variable by 1
	System.out.println(x);//12
	
	// increment and decrement operators work only with variable
	
	// we cannot use 10++ or 10--
	
	int num = 100;
	num++;
	System.out.println(num);
	num--;
	System.out.println(num);
	}

}
