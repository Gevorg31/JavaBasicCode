package com.syntax.class02;

public class NonPrimatives {

	public static void main(String[] args) {
		
		String name="Gevorg";
		String lastName="Agadzhanyan";
		long phone=1234567890L;
		//xx-xx-xxxx
		String phoneNumber="123-456-7890";
		String address="123 Washington str";
		int age=30; // "10" String
		String city="Miami";
		city="Los Angeles";
		//shortcut for printing (type syso +ctrl +space and enter )
		/*
		 * when we want to attach String to String we can use +
		 * to attache String to int
		 * to attache String to double
		 * to attache any type
		 */
		
		System.out.println(name+" "+lastName);// Concatenation operation means attache
		//Gevorg lives in Miami
		System.out.println(name+" lives in "+city);
		//Gevorg is 30 years old
		String words="years old";
		System.out.println(name+" is "+age+" years old");
        System.out.println(name+" is "+phoneNumber+' '+words);
	}

}
