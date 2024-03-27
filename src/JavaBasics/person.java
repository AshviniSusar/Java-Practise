package JavaBasics;

class person{
	String name;
	void introduce() {
		System.out.println("hi,my name is "+name);
	}

public static void main(String []args) {
	person person1=new person();
	person1.name="alice";
	person1.introduce();
	
	
	person person2=new person();
	person2.name="bob";
	person2.introduce();
}
}
