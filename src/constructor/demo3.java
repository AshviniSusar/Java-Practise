package constructor;

public class demo3 {

	String name;
	int age;

	public demo3() {
		name = "ashu";
		age = 23;

		System.out.println(name + " " + age);

	}

	public static void main(String args[]) {
		demo3 obj = new demo3();
	}
}