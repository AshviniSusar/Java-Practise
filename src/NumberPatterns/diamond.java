package NumberPatterns;

public class diamond {
	public static void main(String args[]) {

		int number = 5;

		int i, j;
		for (i = 1; i <= number; i++) {

			// Inner loop 1 print whitespaces inbetween
			for (j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}

			// Inner loop 2 prints star
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Outer loop 2
		// Prints the second half diamond
		for (i = number - 1; i > 0; i--) {

			// Inner loop 1 print whitespaces inbetween
			for (j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}

			// Inner loop 2 print star
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
