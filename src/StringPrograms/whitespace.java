package StringPrograms;

public class whitespace {

	public static void main(String[] args) {
 String s="ashu susar  45 234 shir pur";
  int count =0;
  for(int i=0;i<s.length();i++) {
	  char c=s.charAt(i);
	  c= Character.toLowerCase(c);
	  if( Character.isWhitespace(c)||Character.isDigit(c))count++;
  }
  System.out.println("Count ="+count);
		
		
		
	}

}
