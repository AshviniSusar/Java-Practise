package JavaBasics;

public class Ifelse {

	public static void main(String[] args) {
		int temperature = 28;

		if (temperature >= 30) {
		    System.out.println("It's a hot day.");
		} else if (temperature >= 20) {
		    System.out.println("It's a pleasant day.");
		} else {
		    System.out.println("It's a cold day.");
		}

		
		
		
		
		
		int num1 = 15;
		int num2 = 12;

		if (num1 > num2) {
		    System.out.println("num1 is greater than num2.");
		} else if (num2 > num1) {
		    System.out.println("num2 is greater than num1.");
		} else {
		    System.out.println("num1 and num2 are equal.");
		}

		
		
		
		
		int year = 2022;

		if (year % 4 == 0) {
		    System.out.println(year + " is a leap year.");
		} else {
		    System.out.println(year + " is not a leap year.");
		}

		
		
		
		int age = 14;
		boolean isStudent = true;

		if (age <= 18 && isStudent) {
		    System.out.println("You qualify for a student discount.");
		} else {
		    System.out.println("You do not qualify for a student discount.");
		}

		
		
		
		
		int num = -7;

		if (num > 0) {
		    System.out.println("The number is positive.");
		} else if (num < 0) {
		    System.out.println("The number is negative.");
		} else {
		    System.out.println("The number is zero.");
		}

	}

}
