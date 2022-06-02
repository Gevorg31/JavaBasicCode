package com.syntex.class03;

public class IfNoBracs {

	public static void main(String[] args) {
		/*
		 * without the braces java can identify only 1 statement per block
		 */
		String time="morning";
			if(time.equals("morning")) {
				System.out.println("Say Good Morning");
			}
	}

}
