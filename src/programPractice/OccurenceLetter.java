package programPractice;

public class OccurenceLetter {

	public static void main(String []args) {
	String a ="java programming is very easy";
		int count=0;
		
		for (int i= 0;i<a.length();i++) {
			if(a.charAt(i)=='a') {
				count++;
				
			}
	}
		System.out.println("number of occurence letter a:"+count);
		
	}
}
