package NumberPatterns;

public class NumberTriangle2 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("2 ");
				} else {
					System.out.print("1 ");
				}

			}
			System.out.println();

		}
		
		//////////////////////////////////////////
		
		
		int q = 5;
		for (int i = 1; i <= q; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("& ");
				}

			}
			System.out.println();

		}
		
		
		
		

	}

}
