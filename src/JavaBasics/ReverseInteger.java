package JavaBasics;

public class ReverseInteger {
public static void main(String args[]) {
	int number=234456;
	int reversedNumber=reversedInteger(number);
	
	System.out.println("original number: "+ number);
	System.out.println("reversedNumber: "+reversedNumber);
}
	
	public static int reversedInteger(int num) {
		int reversed =0;
		 while (num != 0) {
	            int digit = num % 10; // Extract the last digit
	            reversed = reversed * 10 + digit; // Add the digit to the reversed number
	            num /= 10; // Remove the last digit from the original number
	        }
	        
	        return reversed;

	
	
}
}
