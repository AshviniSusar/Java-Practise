package MyOwnPractice;

public class Thiscallingstatement {
	
	class sample {
     sample (int a){
    System.out.println("software");
		
	}
     
     sample (double b ,int a){
    	 this(5);
    	 System.out.println("hello");
     }
     
     sample (double b,char c,int a){
    	 this(9.12,5);
    	 System.out.println("myprogramm");
     }
     public static void main (String []args) {
     new sample (5.12,'a','s');
}
	}
}
}
