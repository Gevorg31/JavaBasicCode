package com.syntex.class05;

public class NotCondition {

	public static void main(String[] args) {
		
		boolean boo = !true;
		System.out.println(boo);
		
		boolean boo1 = !false;
		System.out.println(boo1);
		
		
		boolean traffic = false;
		
		if(!traffic) {
			System.out.println("I will reach work on time");
		}

		String name = "George"; // it reverse from true to falls / from falls to true
		
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and i need Emre");
		}
		
	}

}
