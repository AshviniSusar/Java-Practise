package Interview_Programs;

public class Factorial_number {
public static void main(String args[]) {
	
	//Factorial of a number is multiplication of all integers smaller than or equal to that number
	
	int number=5, fact =1;
	for(int i=1;i<=number;i++) {
		fact=fact*i;
		
	}
	System.out.println("Factorial of the number "+fact);
	
	///////////////////////////////////////////////
	
	 
	int number1=6, fact1 =1;
	for(int i=1;i<=number1;i++) {
		fact1=fact1*i;
		
	}
	System.out.println("Factorial of the number "+fact1);
	
	
	
	
	
	
}
}
