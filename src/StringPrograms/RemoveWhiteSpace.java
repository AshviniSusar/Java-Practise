package StringPrograms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="Ashivini susar ";
		String d=" ";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
				d=d+c;
			
		}
System.out.println(d); 
	}

}
