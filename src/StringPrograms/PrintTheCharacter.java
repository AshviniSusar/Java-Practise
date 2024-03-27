package StringPrograms;

public class PrintTheCharacter {
public static void main(String args[]) {
	String s="in the box";
	String w=" "; s+=" ";
	for(int i=0;i<s.length();i++) {
		char c= s.charAt(i);
		if(c!=' ')
			w+=c;
		else {
			System.out.println(w);
			w=" ";
		}
	}
	
	
	
}
}
