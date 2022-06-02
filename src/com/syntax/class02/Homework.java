package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		
		// Task number 1
		double num1=96.96;
		double num2=9.69;
		double sum, sub, mult, div;
		
		sum=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		
		System.out.println("The eddition of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The subtracting of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+"is equal to "+mult);
		System.out.println("The division of 2 number "+num1+" and "+num2+" is equal to "+div);
		
		// Task number 2
		double num3=3.9;
		double num4=num3*num3;
		System.out.println("The square of the "+num3+" is "+num4);
		
		// Task number 3
		int W = 5;
		int H = 8;
		int perimeter, area;
		area=W*H;
		perimeter=2*(W+H);
		System.out.println("The perimetr of a rectangle with width "+W+" and height "+H+" is equal to "+perimeter+" and the area is "+area);
		

	}

}
