package StringPrograms;

public class CountTheCharacter {
public static void main(String args[]) {
	String s="Ashvini Shivaji  SusAR";
	
	int count=0, count1=0;
	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(Character.isUpperCase(c))
			count++;
			if(Character.isLowerCase(c))
				count1++;
		
			
	}
	System.out.println(count + " upper");
	System.out.println(count1 + " lower");
	
}
}
