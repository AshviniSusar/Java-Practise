package StringPrograms;

public class PrintCapitalLetter {
public static void main(String args[]) {
	
	String s=" Ashvini Shi34vaji Susar";
	
	 for(int i=0;i<s.length();i++) {
		 char c=s.charAt(i);
		 if(Character.isUpperCase(c))
			 System.out.println(c);
	 }
	 
}
}
//same program used for this
// (Character.isLowerCase(c))
//  (Character.isdigit(c))
// (Character.isLetterOrDigit(c))