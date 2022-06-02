package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		//

		String[] disney = { "Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry" };

		for (int i = 0; i < disney.length; i++) {
			System.out.print(disney[i] + " ");
		}

		System.out.println();

		for (String character : disney) {
			System.out.print(character + " ");
		}
 
		System.out.println();

		for (int i = 0; i < disney.length; i++) {
			if (disney[i].equalsIgnoreCase("Shrek")) {
				System.out.print(disney[i] + " is my favorite character");
			} else {
				System.out.println(disney[i]);
			}
		}

		System.out.println();

		for (String character : disney) {
			if (character.equalsIgnoreCase("Mulan")) {
				continue;
			} else {
				System.out.println(character + " ");
			}
		}

	}

}
