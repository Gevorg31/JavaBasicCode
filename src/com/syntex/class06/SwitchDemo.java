package com.syntex.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		// variable and matching cases MUST be of the same type
		// switch does not allow to have a duplicated cases
		char choise = 'Y';
		String meaning;
		switch (choise) {

		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";
		}
		System.out.println(meaning);
	}

}
