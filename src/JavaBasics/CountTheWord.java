package JavaBasics;

import java.util.Arrays;

public class CountTheWord {
public static void main(String args[]) {
	String s="my name is ashhu";
	
 String words[]= s.split(" ");    //split the word using space
	
 System.out.println(Arrays.toString(words));
 
 System.out.println(words.length);    //for length
}
}
