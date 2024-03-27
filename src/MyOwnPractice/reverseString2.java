package MyOwnPractice;

public class reverseString2 {
public static void main(String[] args) {
	String s="123456";
	String temp=" ";
	for(int i =s.length()-1;i>0;i--) {
		temp=temp+s.charAt(i);
	}
		System.out.println(temp);
}
}
