package JavaBasics;

public class Number {
	    public static void main(String[] args) {
	        int rows = 5;

	        System.out.println("Pyramid of Numbers:");
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  "); // Print spaces for alignment
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	    }
}
