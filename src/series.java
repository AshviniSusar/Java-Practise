import java.util.Scanner;
public class series {

	public static void main(String[] args) {
     int sum=0;
   Scanner sc=new Scanner (System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
 for(int i=1,a=9;i<=n;i++,a+=4) {
   sum=sum+a;
   
	}
System.out.println("sum: "+sum);
}
}