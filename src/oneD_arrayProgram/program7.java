package oneD_arrayProgram;

public class program7 {
public static void main(String args[]) {
	int arr[]= {5,12,4,21,8,2,3,7,9,11};
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0)
			count++;
	}
	System.out.print("even:"+count);
}
}
