package oneD_arrayProgram;

public class program4 {

	public static void main(String[] args) {
		int a[] = { 34, 25, 567, 6, 787, 86, 65, 4 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 10 == 7) {         
				
				System.out.println(a[i]);
			}

		}

	}

}



//if (a[i] % 10 == 7)   // for printing digit with ending 7
// if (a[i] %5 ==0)      // for printing digit with divide by 5 
//if (a[i]>0)          // for printing digit with positive number


