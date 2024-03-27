package StringPrograms;

public class SwapCaseString {

	public static void main(String[] args) {
		String s="fdffghgfdgfgb urdfghjg ";
		
		 for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				s+=Character.isLowerCase(c);
			else if(Character.isLowerCase(c))
				s+=Character.isUpperCase(c);
			else s+=c;
		 }
		 System.out.println("New String =" +s);

		 }
	

}
