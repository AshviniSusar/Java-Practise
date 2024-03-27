package programPractice;

public class max_and_secondmax_number {
public static void main(String args[]) {
	int a[]= {1,2,3,4,5,6,7};
	int temp;	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			 if (a[i]<a[j]) {
			 temp=a[i];
			 a[i]=a[j];
	       a[j]=temp;
	      
		}
		
	}
	
}
     System.out.println(a[1]);
     // if we write 0 then we get max number from array 
     // but if we wrote  1 then we get the second max number from array
}
}



