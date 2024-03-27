package constructor;

public class demo4 {

	String name;
	int age;
	char a;
	short num;
	byte b;

	public demo4() {
		name = "ashu";
		age = 23;
		a = 78;
		num = -32768;
		b = -128;
		System.out.println(name + " " + age + " " + a + " " + num + " " + b);
	}

	public demo4(int age2, String name2) {
		age = age2;
		name = name2;
		System.out.println(name + " " + age);
	}

	public static void main(String args[]) {
		demo4 obj = new demo4();
		demo4 obj2 = new demo4(34, "adfggh");
	}
}
