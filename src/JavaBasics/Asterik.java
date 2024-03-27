package JavaBasics;

public class Asterik {
	
	    public static void main(String[] args) {
	        int rows = 5;

	        System.out.println("Pattern:");
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}


