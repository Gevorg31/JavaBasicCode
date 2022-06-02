package com.syntex.class05;

public class HomwWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 14;
		int num2 = 15;
		int num3 = 23;
		
		if (num1>=num2) {
			if (num1>=num3) {
				System.out.println(num1+" is latgest number");
			}else {
				System.out.println(num3+" is largest number");
			}
		}else {// otherwise num2>num1
			if (num2>num3) {
				System.out.println(num2+" is largest number");
			}else {//num3>num2
				System.out.println(num3+" is largest number");
			}
		}
	}

}
