package MyOwnPractice;

public class TryCatch {
	public static void main(String[] args) {
		String s[] = { "ashvini" };
		try {
			System.out.println(s[1]);
		} catch (ArrayIndexOutOfBoundsException w) {

			System.out.println("chillax");
		}

		finally {
			System.out.println("no matter i will be there");

		}
	}
}
