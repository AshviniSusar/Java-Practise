package programPractice;

public class DuplicateNumber {

	public static void main (String [] args) {
		
		int arr[]= {5,2,0,3,6,8,8,9};
		System.out.println("Duplicate no in given array");
		for (int i= 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}

		}
	}
}
