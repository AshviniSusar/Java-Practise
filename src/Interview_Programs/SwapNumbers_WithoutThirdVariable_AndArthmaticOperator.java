package Interview_Programs;

public class SwapNumbers_WithoutThirdVariable_AndArthmaticOperator {
public static void main(String args[]) {
	
	int n1=80;
	int n2=70;
	
	System.out.println("Before swap"+n1+","+n2);
	
	n1=n1^n2;
	n2=n1^n2;      //This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values,
	n1=n1^n2;       //i.e., if corresponding bits are different, it gives 1, else it shows 0
	
	
	System.out.println("After swap"+n1+","+n2);
	
}
}
