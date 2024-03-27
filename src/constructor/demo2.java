package constructor;

public class demo2 {

	String name;
	int age;

	public demo2() {
		name = "ashvini";
		age = 24;
		System.out.println(name + " " + age);

	}

	public static void main(String args[]) {

		demo2 obj = new demo2();
	}
}