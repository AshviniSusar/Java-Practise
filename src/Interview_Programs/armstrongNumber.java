package Interview_Programs;

public class armstrongNumber {
	public static void main(String args[]) {

		// Armstrong number is a number that is equal to the sum of cubes of its digits.
		// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

//	Let's try to understand why 153 is an Armstrong number.
//
//	153 = (1*1*1)+(5*5*5)+(3*3*3)  
//	where:  
//	(1*1*1)=1  
//	(5*5*5)=125  
//	(3*3*3)=27  
//	So:  
//	1+125+27=153  

		int num = 154, result = 0, rem;
		int temp = num;

		while (num > 0) {
		
			rem = num % 10;
			num=num/10;
			result = result + (rem * rem * rem);
		}

		if (result == temp) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");

		}

	}
}
