package com.syntex.class05;

import java.util.Scanner;

public class HWCityTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input city");
		String name = input.next();
		
		System.out.println("Input temperature");
		int temperature = input.nextInt();
		
		System.out.println("The temperature in the city "+name+" is "+(temperature-32)/1.8);
		}

	}

