package NumberPatterns;

public class NumberTriangle {
public static void main(String args[]) {
	//this will print from 5
	int n=5;
	for(int i=1,p=5;i<=n;i++,p--) {
	 for(int j=1;j<=i;j++) {
			System.out.print(p+" ");
		}
	 System.out.println();
	}
	
	
//////////////////////////////////////////////////////	
	
	
	
	// this will print from 1
	int q=5;
	for(int i=1,p=1;i<=q;i++,p++) {
	 for(int j=1;j<=i;j++) {
			System.out.print(p+" ");
		}
	 System.out.println();
	}
	
	
	
}
}
