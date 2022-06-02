package com.syntax.class09;

public class HWClock2 {

	public static void main(String[] args) {

		for (int hrs = 0; hrs < 24; hrs++) {

			for (int min = 0; min < 60; min++) {
				
				if (min < 10 & hrs < 10) {
					System.out.println("0" + hrs + ":" + "0" + min);
				} else if (min < 10) {
					System.out.println(hrs + ":" + "0" + min);
				} else if (hrs < 10) {
					System.out.println("0" + hrs + ":" + min);
				} else {
					System.out.println(hrs + ":" + min);
				}
			} 
		}

	}

}
