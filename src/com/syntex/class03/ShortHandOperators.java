package com.syntex.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;// reassigning the valueF
		
		System.out.println(num);
		
		num=num+50;
		System.out.println(num);
		
		// short hand operator
		
		num+=100; // addition num=num+100;
		System.out.println(num);
		num-=10; // subtraction num=num-10;
		System.out.println(num);
		num/=10; // division num=num/10;
		System.out.println(num);
		num*=2; // multiply num=num*10;
		System.out.println(num);
		num%=2;
		System.out.println(num);// mod 
		
		int a=10;
		int b=20;
		int c=30;
		a+=b;
		System.out.println(a); // 30
		a+=b+c;
		System.out.println(a); // 80
		a*=10;
		System.out.println(a);// 800
		
			

	}

}
