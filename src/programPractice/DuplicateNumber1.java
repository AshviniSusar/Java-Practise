package programPractice;

public class DuplicateNumber1 {
public static void main(String args[]) {
	
	int arr[]= {4,5,4,9,5,8,6};
	System.out.println("duplicate number in given array ");
	
	for(int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			
			if (arr[i]==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
}
}
