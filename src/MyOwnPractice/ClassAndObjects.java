package MyOwnPractice;

class ClassAndObjects {
	
		int s = 32;
		String d = "ashvini";
		
		void show() {
		System.out.println(s +" "+d);

	}
}

class Test {
	public static void main(String args[]) {

		ClassAndObjects obj = new ClassAndObjects();
		obj.show();

	}

}