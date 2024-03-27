package NumberPattern;

public class numberPyramid {
public static void main(String args[]) {
	
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		
		
	}
	
	for(int i=0;i<=5;i++) {
		for(int j=5;j>1;j--) {
			System.out.print("");
		}
		for(int p=5;p>=i;p--) {
			System.out.print("*"+" ");
		}
		System.out.println("");
	}
	
	
}
}
