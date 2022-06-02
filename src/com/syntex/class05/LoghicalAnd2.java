package com.syntex.class05;

public class LoghicalAnd2 {

	public static void main(String[] args) {
		
		boolean study = true;
		boolean homework = true;
		boolean practice = true;
		
		if(study && homework && practice) {
			System.out.println("You will succeed in the cpurse");
		}else {
			System.out.println("You will struggle");
		}
		
	}

}
