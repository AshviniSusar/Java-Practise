package JavaBasics;

public class Methodtype2 {
	public void method1() {
		System.out.println("susar");
	}

	public void method2() {
		System.out.println("shivaji");
	}

	public void method3() {
		System.out.println("ashvini");
	}

	public static void method4() {
		System.out.println("buldana");
	}

	public void method(String name, int age) {
		System.out.println(name + " " + age);
	}

	public static void method5(String name, int age) {
		System.out.println(name + " " + age);
	}

	public static void main(String args[]) {
		System.out.println("ashu");
		Methodtype2 obj = new Methodtype2();
		obj.method1();
		obj.method2();
		obj.method3();
		method4();
		obj.method("ashvini", 23);
		method5("saurav", 19);

		System.out.println();

	}
}
