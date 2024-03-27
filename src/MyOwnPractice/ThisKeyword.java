package MyOwnPractice;

public class ThisKeyword {
int a;
double b;
String c;
void ashvini(int a,double b, String c)
{
	System.out.println("i am girl");
}
public static void main(String args[]) {
	{
	ThisKeyword t=new ThisKeyword();
	t.ashvini(1,1.11,"ashvini");
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(t.c);
	}
}
}
