 package programPractice;
import java.util.Arrays;
public class SecondMaxNumberFromArray {

	public static void main (String[]args) {
		int a[]= {30,50,23,56,67,86};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(a[1]);
		
		
		
	}
	
}
