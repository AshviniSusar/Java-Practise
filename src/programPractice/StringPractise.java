package programPractice;

import java.util.ArrayList;

public class StringPractise {

	public static void main(String args[]) {
		String a = "ashvini";

		ArrayList<Character> obj = new ArrayList<Character>();
		ArrayList<Character> obj1 = new ArrayList<Character>();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				obj.add(a.charAt(i));
			} else {
				obj1.add(a.charAt(i));
			}
		}

		for (char b : obj) {
			System.out.println(b);
		}

		for (char c : obj1) {
			System.out.println(c);
		}

	}

}
