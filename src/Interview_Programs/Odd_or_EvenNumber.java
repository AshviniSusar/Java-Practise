package Interview_Programs;

public class Odd_or_EvenNumber {
	public static void main(String args[]) {

		// the number which is divisible by 2 and remainder is 0 s called even number
		// the number which is not divisible by 2 is called odd number and the remainder
		// is always 1

		int number = 10;
		if (number % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");

		}

		int num = 30;
		if (num % 2 != 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");

		}
	}
}