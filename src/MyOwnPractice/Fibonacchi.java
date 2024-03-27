package MyOwnPractice;

public class Fibonacchi {
public  static void main(String args[]) {
	
	int n1=0,n2=1,sum,count=15;   //count= how many numbers we have to print
	System.out.print(n1+","+n2);
	
	
	//we first two numbers print so now this loop will start from 2
	for(int i=2;i<count;i++) {
		sum=n1+n2;
		System.out.print(","+sum);
		n1=n2;
		n2=sum;
		
		
	}
	
}
}
