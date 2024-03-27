package Interview_Programs;

public class Palindrome_Number {
public static void main(String args[]) {
	
	// a palindrome number is number which is same after reverse
	// eg= 181,171,1234321,4897894
	
	int rem,sum=0,temp;
	int num=12321;
	 temp=num;
	 
	 while(num>0) {
		 rem=num%10;
		 sum=(sum*10)+rem;
		 num=num/10;
		 
	 }
	if(temp==sum) {
		System.out.println("its a palindrome number");
	}
	else {
		System.out.println("its not a palindrome number");
	}
}
}
