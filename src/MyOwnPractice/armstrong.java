package MyOwnPractice;

public class armstrong {
	public static void main(String args[]) {

		int num = 154, result = 0, rem;
		int temp = num;

		while (num > 0) {
			rem = num % 10;
			num = rem / 10;
			result = result + (rem * rem * rem);

		}
		if (result == temp) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not A armstrong number");
		}
	}
}
