package programPractice;

public class AscendingOrder {
	public static void main(String args[]) {
		int a[] = { 50, 40, 30, 20, 10 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		for (int b : a) {
			System.out.println(b);
		}
	}
}
