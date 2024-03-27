package JavaBasics;

import java.util.Arrays;

public class TwoDimensionalArray {
public static void main(String args[]) {
	           //0th array                    //1st array
	int a[][]={{23,34,67,57,67,88,87,65},{45,56,56,67,34,23,13}};
	
	System.out.println(a.length);    //length of arrray
	System.out.println(a[1].length);    //length of first array
	System.out.println(a[1][4]);   //access the value at specific index
	
	System.out.println((a[0].length)+(a[1].length));   //length of both array
	
	
	System.out.println(Arrays.toString(a[0])+Arrays.toString(a[1]));     //print the array
	
	//using for loop
	for(int i=0;i<a.length;i++) {
	System.out.println(Arrays.toString(a[i]));
	
	}
}
}