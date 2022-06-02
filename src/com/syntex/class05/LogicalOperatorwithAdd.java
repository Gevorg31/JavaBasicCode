package com.syntex.class05;

public class LogicalOperatorwithAdd {

	public static void main(String[] args) {
		
		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		
		if (num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is "+num3);
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}

	}

}
