package com.syntex.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		int temp = 30;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}

		int temp2 = 40;

		if (temp2 < 33) {
			System.out.println("Water will freeze with temperature " + temp2);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp2);
		}

	}

}
