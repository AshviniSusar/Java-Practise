package programPractice;

import java.util.Arrays;

public class WordsReverseWithoutChangingPosition {
private static String h;

public static void main(String[]args) {
	String s="hello i love java";
	//output=olleH i evol avaj
	String temp=" ";
	for(int i=s.length()-1;i>=0;i--) {
		temp=temp+s.charAt(i);
	}
	System.out.println(temp);

	String words[]=temp.split(" ");
	//{"avaj","evol","i","olleh"}
	System.out.println(Arrays.toString(words));
	for(int i=words.length-1;i>=0;i--) {
		System.out.print(words[i]+" ");
	}
	
}
}
