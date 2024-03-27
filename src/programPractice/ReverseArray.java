package programPractice;

import java.util.Arrays;

public class ReverseArray {
public static void main(String args[]) {
	int a []= {10,20,30,40,50};
	System.out.println(Arrays.toString(a));
	
	for(int i=4;i>=0;i--) {
		System.out.println(a[i]);
	}
	
}
}
