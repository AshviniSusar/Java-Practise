package programPractice;

public class StarPattern2 {
public static void main(String args[]) {
	int number=5;
	int i,j;
	for(i=1;i<=number;i++) {
		//inner loop 1 print whitepaces in between
		for (j=1;j<=number-1;j++) {
			System.out.print("");
		}
		//inner loop prints star
		for(j=1;j<=i*2-1;j++) {
			System.out.print("*");
		}
		//ending line after each row
		System.out.println();
	}
}
}
