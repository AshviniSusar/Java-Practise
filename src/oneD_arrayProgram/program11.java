package oneD_arrayProgram;

public class program11 {

	public static void main(String[] args) {

		int num = 1234;
		int Even_Count = 0;
		int Odd_Count = 0;

		while (num > 0) {

			int rem = num % 10;
			if (rem % 2 == 0) {
				Even_Count++;

			} else {
				Odd_Count++;
			}
			num = num / 10;
		}

		System.out.println("Even_Count:" + Even_Count);

		System.out.println("Odd_Count:" + Odd_Count);

	}
}