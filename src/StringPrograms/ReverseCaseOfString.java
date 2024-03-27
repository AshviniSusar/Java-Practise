package StringPrograms;

public class ReverseCaseOfString {
	public static void main(String args[]) {
		String s = " Ashvini23 Susar";

		String d = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				d = d + Character.toLowerCase(c);
			else
				d = d + Character.toUpperCase(c);

		}
		System.out.print(d);
	}
}
