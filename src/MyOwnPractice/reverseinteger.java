package MyOwnPractice;

public class reverseinteger {
public static void main(String[] args) {
	
 int number = 24454245,reverse=0;
	while( reverse !=0);
	
	{
		int remainder =number %10;
		reverse = reverse*10+remainder;
		number = number/10;
		
	}
	System.out.println("the number is:"+ reverse);
}
}
