package MyOwnPractice;

public class Armstrong2 {
public static void main(String args[]) {
	
	int num=153,result=0,rem;
	int temp=num;
	
	while(num>0){
	rem=num%10;
	num=rem/10;
	result=result+(rem*rem*rem);
}

 if(result==temp){
		System.out.println("armstrong number");
	}
 else {
	 System.out.println("not armstrong number");
 }	
}
}
