package MyOwnPractice;

public class Local_global {
static	int a=10;
	int a2=100;
	static int a3;
	static int s=90;
	
public static void main(String[] args) {
	
	s=900;
	int a1=20;
	a=19;
	a1=20;
	System.out.println(a);
	Local_global l1=new Local_global();
	System.out.println(l1.a2);
}
}
