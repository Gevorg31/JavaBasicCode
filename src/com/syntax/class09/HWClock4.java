package com.syntax.class09;

public class HWClock4 {

	public static void main(String[] args) {

		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 3; b++) {
				if (a==2 && b==4) {
					break;
				}
				for (int c = 0; c<=5; c++) {
					for (int d =0; d<=9; d++) {
						System.out.println(a+""+b+":"+c+d);
					}
				}
			} 
		}

	}

}
