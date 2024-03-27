package Abstract;

public class demo2 extends demo {

	
	public void method2() {
		System.out.println("bye");
	}
	
	public static void main(String args[]) {
		
		demo2 obj=new demo2();
		obj.method1();
		obj.method2();
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
}

