package Interview_Programs;

public class PrimeNumber_orNot {
public static void main(String args[]) {
	
	//Prime number is a number that is greater than 1 and divided by 1 or itself only.
	//In other words, prime numbers can't be divided by other numbers than itself or 1.
	//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	
	int number=9;
	int temp=0;
	
	for(int i=2;i<=number%2;i++) {
		if(number%i==0) {
			temp=temp+1;
			break;
		}
	}
	if(temp==0) {
		System.out.println("number is prime");	
	}
	else {
		System.out.println("number is odd");	
	}
	
	
	
	
	
	
	
}
}
