package JavaBasics;

public class ifelseifelse {
	public static void main(String args[]) {

		int mark = 90;

		if (mark > 90) {
			System.out.println("distinction");
		} else if (mark > 75 && mark <= 90) {
			System.out.println("first class");
		} else if (mark > 50 && mark <= 75) {
			System.out.println("second class");
		} else {
			System.out.println("fail");
		}
	}
}
