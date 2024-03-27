package Interview_Programs;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int n1=30;
		int n2=40;
		
		System.out.println("Before swap"+n1+","+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		
		System.out.println("after swap"+n1+","+n2);

	}

}
