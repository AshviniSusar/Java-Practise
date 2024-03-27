package MyOwnPractice;

public class Vowels3 {

	
	    public static void main(String args[]) {

	        String str = "welcome";
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println("true");
	                count++;
	            } else {
	                System.out.println("false");
	            }
	        }

	        System.out.println("Total vowels found: " + count);
	    }
	}


