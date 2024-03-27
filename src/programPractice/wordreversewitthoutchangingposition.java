package programPractice;

public class wordreversewitthoutchangingposition {
public static void main(String[] args) {
	String a= "my ,name ,is,ashuu";
	String temp=" ";
	for(int i=a.length()-1;i>=0;i--) {
		temp=  temp+a.charAt(i);
	}
	System.out.println(temp);
}
}
