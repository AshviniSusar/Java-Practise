package programPractice;

public class reverseString {

	public static void main(String[]args) {
		//max index==length-1
		String s="rahul ";
		//s.length=5
		String temp="";
		for (int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
			//temp = ""+l   =l          //1st iteration
			//temp = l+u    =lu        //2nd iteration
			//temp = lu+h   =luh      //3rd iteration
			//temp = luh+a  =luha    //4th iteration
			//temp = luha+R =luhaR  //5th iteration
		}
		System.out.println(temp);
	}
}
