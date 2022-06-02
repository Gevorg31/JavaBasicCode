package com.syntex.class04;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 555;
		int c = 9999;
		
		if (a>(b+c)) {
			System.out.println(a+" larger then "+b+" and "+c);
			if (b>(c+a)) {
				System.out.println(b+" larger then "+c+" and "+a);
			}
		}else if (c>(a+b)) {
			System.out.println(c+" larger then "+a+" and "+b);
		}

	}

}
