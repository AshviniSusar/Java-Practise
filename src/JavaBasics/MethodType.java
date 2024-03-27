package JavaBasics;

public class MethodType {

	public void method1() { // method 1 non static method
		System.out.println("susar");
	}

	public void method2() {
		System.out.println("shivaji"); // method2 non static method
	}

	public static void method3() { // method 3 static method
		System.out.println("buldana");
	}

	public void method(String name, int age) { // parameterized method
		System.out.println(name + " " + age);
	}

	public static void method4(String name, int age) { // method 4 parameterized static method
		System.out.println(name + " " + age);
	}

	public static void addition(int a, int c) {
		System.out.println(a + c);
	}

	public int age() {
		int a = 34;
		int c = 53;
		// System.out.println(a+c);
		return a + c;
	}

	public void age2() {
		int b = 3;
		// void doesent return value
	}

	public void method5() {
		addition(age(), 20); // calling addition from method addition
		addition(age(), 32);

	}

	public static void main(String args[]) { // main method
		System.out.println("ashu");

		MethodType obj = new MethodType(); // classname obj = new classname();

		obj.method2(); // calling th method 2
		obj.method1(); // calling the method 1
		method3(); // calling the method3

		method4("ashvini", 23);
		addition(34, 43);

		System.out.println(obj.age()); // calling method age directly in main method
	}
}
