package oneD_arrayProgram;

public class program2 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 8, 9 };

		//// for printing odd number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("   "); // for printing space

	
		
		// for printing even number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}

		}
	}
}
