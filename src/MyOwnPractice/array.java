package MyOwnPractice;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]);
		}
		String s[]= {"rahul","ramesh","ram"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		for(int k:a) {
			System.out.println(k);
			 
		}
		
	}

}
