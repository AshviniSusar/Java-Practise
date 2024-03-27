package programPractice;

public class StringReverse {

	public static void main(String args[]) {
	
		String a= "level";
		String temp="";
		
		for(int i =4;i>=0;i--) {
			temp=temp+a.charAt(i);
			
		}
		System.out.println(temp);
	}
}
