package Interview_Programs;

public class FibonaccchiNumber {
public static void main(String args[]) {
	
	// in Fibonaccchi series the next number is the  sum of previous two number
	// for example=0,1,1,2,3,5,8,
	// the first two number of fibonacchi series is 0 and 1.
	
	int n1=0, n2=1, sum,count=10;
	
	System.out.print("fibonacchi number is:"+n1+","+n2);
	
	for(int i=2;i<count;i++) {
		sum=n1+n2;
		System.out.print(","+sum);
		n1=n2;
		n2=sum;
		
	}
	
	
}
}
