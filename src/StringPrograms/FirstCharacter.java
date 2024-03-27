package StringPrograms;

public class FirstCharacter {
public static void main(String args[]) {
	
	//this program will give the first character of each word
	
	String s="in the box";
	String w=""; s+=" ";
	for(int i=0;i<s.length();i++) {
		char c= s.charAt(i);
		if(c!=' ')
			w+=c;
		else {
			System.out.println(w.charAt(0));
			w="";
		}
	}
	
	
	
	
}
}
