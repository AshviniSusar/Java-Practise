package JavaBasics;

public class SecondMaxNumberFromArray {
	public static void main(String args[]) {
		int a[] = { 10, 57, 60, 30, 76, 53, 34, 43, 56, };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[1] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(a[1]);
	}
}
