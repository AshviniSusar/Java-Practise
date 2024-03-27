package MyOwnPractice;

public class TryCatch5 {
	public static void main(String[] args) {

		try {
			int a[] = { 34, 34, 56, 77, 88, 99, 99 };
			System.out.println(a[9]);

			int b = 10;
			System.out.println(b / 10);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}

		System.out.println("hello");
	}
}
