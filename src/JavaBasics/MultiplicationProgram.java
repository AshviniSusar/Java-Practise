package JavaBasics;

public class MultiplicationProgram {
	
	    public static void main(String[] args) {
	        int tableSize = 10;

	        System.out.println("Multiplication Table:");
	        for (int i = 1; i <= tableSize; i++) {
	            for (int j = 1; j <= tableSize; j++) {
	                int product = i * j;
	                System.out.printf("%4d", product); // Print with formatting
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}


