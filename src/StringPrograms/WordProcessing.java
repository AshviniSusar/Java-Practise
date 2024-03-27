package StringPrograms;

public class WordProcessing {

	public static void main(String[] args) {
String s="In The Box";
String w=""; s+= " ";
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c!=' ')
		w+=c;
	else {
		
		// System.out.println(w);
		// System.out.print(w.charAt(0));
		// System.out.print(w.substring(0,2));
		w="";
	}
}


	}

}
