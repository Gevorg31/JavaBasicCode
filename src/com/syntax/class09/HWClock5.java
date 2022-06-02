package com.syntax.class09;

public class HWClock5 {

	public static void main(String[] args) {

		for (int hour = 0; hour <= 23; hour++) {
			if (hour < 10) {
				System.out.println("0"+hour);
			}
			for (int min = 0; min <= 5; min++)
				for (int min2 = 0; min2 <= 9; min2++)
					System.out.println(hour + ":" + min + min2);

		} 
	}
}
