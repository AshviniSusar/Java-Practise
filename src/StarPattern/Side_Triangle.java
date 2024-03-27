package StarPattern;

public class Side_Triangle {
public static void main(String args[]) {
	
int n=5;
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	int k=5;
	for(int i=0;i<=k;i++) {
		for(int j=i;j<=k;j++) {
			System.out.print("*"+" ");
			
		}
		System.out.println();
		
	}
	
}
}
