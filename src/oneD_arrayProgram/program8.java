package oneD_arrayProgram;

public class program8 {
public static void main(String args[]) {
	
	int arr[]= {5,12,4,21,8,2,3,7,9,11};
	int max=arr[0],min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
	
System.out.println("Max:"+max);
System.out.println("Min:"+min);
}
}
