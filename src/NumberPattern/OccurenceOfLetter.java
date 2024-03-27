package NumberPattern;

public class OccurenceOfLetter {
	public static void main(String args[]) {
		String a = "java is a easy language";

		int count = 0;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'a') {
				count++;

			}
		}

		System.out.println("number of occurence is:" + count);
	}
}
