package programPractice;

public class starPattern {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++){             //outer for loop
	        for(int j=5;j>i;j--){          //inner for loop 1
	            System.out.print(" ");     //to print the spaces
	        }
	    
	        for(int j=0;j<=i;j++){        //inner for loop 2
	            
	            System.out.print("*");   // to print the stars
	        }
	        System.out.println(" ");     //to move control to the next line
		}

		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > 1; j--) {
				System.out.print(" ");
			}
			for (int p = 5; p >= i; p--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
