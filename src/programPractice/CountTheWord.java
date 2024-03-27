package programPractice;

public class CountTheWord {
public static void main(String[]args) {
	String h="Hello i love java";
	//4
	//split the String using space
	String words[]=h.split(" ");
	//{"hello","i","love","java"}
	String temp="";
	for(int i=words.length-1;i>=0;i--) {
		for(int j=words[i].length()-1;i>=0;j--) {
			temp=temp+words[i].charAt(j);
			
		}
	}
	System.out.println(temp);
}
}
