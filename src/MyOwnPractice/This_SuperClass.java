package MyOwnPractice;


class A{
	
int no=20;
int a=40;
	
}

class B extends A{
	int no=30;
	int b=50;
void show (int n) {
	System.out.println(n);
	System.out.println(this.no);
	System.out.println(super.no);
	System.out.println(a);
	System.out.println(b);
}

	
}


public class This_SuperClass {
public static void main(String[] args) {
	
	B ob = new B();
     ob.show(80);
	
}
}
