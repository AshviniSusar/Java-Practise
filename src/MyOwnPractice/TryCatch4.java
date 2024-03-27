package MyOwnPractice;

public class TryCatch4 {
	public static void main(String[] args) {

		try {
			int[] a = { 10, 27, 34, 56, 76, 78, 56 };
			System.out.println(a[4]);
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ashu");

		}

		System.out.println("hello");

	}

}
