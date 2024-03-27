package JavaBasics;

import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a day of the week: ");
		String day = scanner.nextLine();

		// Using switch statement
		switch (day.toLowerCase()) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println(day + " is a weekday.");
			break;
		case "saturday":
		case "sunday":
			System.out.println(day + " is a weekend day.");
			break;
		default:
			System.out.println("Invalid day input.");
		}

		// Using if-else statements
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")
				|| day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
			System.out.println(day + " is a weekday.");
		} else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println(day + " is a weekend day.");
		} else {
			System.out.println("Invalid day input.");
		}
	}
}
