package JavaBasics;

import java.util.Arrays;

public class ReverseTheWords {
public static void main (String args[]) {
	
	String h = "hello i love java";
	
	String  words []=h.split(" ");
	 System.out.println(Arrays.toString(words));
	
	System.out.println(words.length);
	String temp=""; 
	for(int i=words.length-1;i>=0;i--) {
	System.out.print(words[i]);
	System.out.println(" ");
	for(int j=words[i].length()-1;j>=0;j--) {
		temp=temp+words[j].charAt(j);
		System.out.println(temp);
	}
}
 }
}
