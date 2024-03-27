package programPractice;

import java.util.Arrays;

public class CountOfEachWordFromString {
public static void main(String args[]) {
	String a="java is programming Language";
	String word[]=a.split(" ");
	
	System.out.println(Arrays.toString(word));
	
	for(int i=0;i<word.length;i++) {
		System.out.println(word[i].length());
	}
}
}
