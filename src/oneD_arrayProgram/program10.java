package oneD_arrayProgram;

public class program10 {

	public static void main(String[] args) {

		Object[] mixedArray = new Object[] { 'A', 'B', 1, 2, 'C', 'D', 3, 4 };

		for (int i = 0; i < mixedArray.length; i++) {
			if (mixedArray[i] instanceof Character && Character.isLowerCase((char) mixedArray[i])) {
				System.out.println(mixedArray[i]);
			}
		}
	}
}
