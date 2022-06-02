package com.syntex.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		int day = 7;
		String name;
		// if is a condition statement
		if (day == 1) {
			name = "Monday";
		} else if (day == 2) {
			name = "Tuesday";
		} else if (day == 3) {
			name = "Wednesday";
		} else if (day == 4) {
			name = "Thursday";
		} else if (day == 5) {
			name = "Friday";
		} else if (day == 6) {
			name = "Saturday";
		} else if (day == 7) {
			name = "Sunday";
		} else {
			name = "Invalid";
		}

		System.out.println(name);
		// switch is a value base statement.
		switch (day) { // is a great alternative for else if statement cleaner and faster

		case 1:
			name = "Monday";
			break;
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:// we can add everywhere but better be on the bottom
			name = "Invalid";
			//break no need to after default
		}

		System.out.println(name);
	}

}
