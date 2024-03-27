package MyOwnPractice;

public class TryCatch3 {
	public static void main(String[] args) {

		try {
			int a[] = { 10, 43, 45, 77, 88, 32 };
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" error");

		}
		System.out.println(" hello");
	}
}