package StarPattern;

public class Reverse_Hill {
public static void main(String args[]) {
	
	int n=5;
	
	for(int i=1;i<=n;i++) {
		System.out.print(" ");
	}
	for(int j=i;j<n;j++) {
		System.out.print("*");
		
	}
	for(int j=i;j<=n;j++) {
		System.out.print("*");
	}
	System.out.println();
}
}
