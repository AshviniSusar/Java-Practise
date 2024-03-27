package JavaBasics;

public class StringOperators {
public static void main(String args[]) {
	
 String a= "ashvini";
 System.out.println(a);
 System.out.println(a.length());
	
 System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	
	//character at specifix index
	System.out.println(a.charAt(5));
	
	
	String h="hello i 'love' java";
	System.out.println(h);
	
	String k="hello i \\love java";
	System.out.println(k);
	
	String l="hello i \\\\love java";
	System.out.println(l);
	
	String z ="hello i @love java";
	System.out.println(z);
	
	String c="hello i love java       ";
	System.out.println(c.trim());
	
	
	String x="hello";
	String y="bye";
	System.out.println(x.equals(y));
	System.out.println(x.equalsIgnoreCase(y));
	
	
	String v="hello java";
	String m="bye";
	System.out.println(m.contains(v));
	System.out.println(v.contains(v));
}
}
