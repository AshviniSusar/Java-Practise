
public class palindromeNumber2 {

	public static void main(String[] args) {
		int no=123;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;	
		}
		if(no==rev) {
			System.out.print("not palindrome number");
		}else {
		System.out.println("palindrome number");
	}

}
}
