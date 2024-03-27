package StringPrograms;

public class NewStringWithDigitsFirst {

	public static void main(String[] args) {

		String s=" Ashvini 23 susar";
		String d=" ",r=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c))
				d=d+c;
			else
				r=r+c;
			
		}
		
		String sen=d+r;
		System.out.println(sen);		
	}

}
