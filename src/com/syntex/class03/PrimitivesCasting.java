package com.syntex.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {

		// byte => short => int => long => float => double ( widening process )
		int a = 100;
		double b = 100;
		// byte <= short <= int <= long <= float <= double
		int x = (int) 999.55;// narrowing
		System.out.println(x);

		byte r = (byte) 130;
		System.out.println(r);

	}

}
