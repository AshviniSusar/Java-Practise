package programPractice;

public class countOfNumberAndCharacterFromString {
	public static void main(String[]args) {
		// 0 1 2 3 4 5 6 7 8
		String s="adsdh#123";
		int CapitalLetter=0;
		int SmallLetter=0;
		int numbers=0;
		int specialChar=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='A'&&s.charAt(i)<='z') {
				SmallLetter++;
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				numbers++;
			}
			else {specialChar++;}
		}
		System.out.println(CapitalLetter);
		System.out.println(SmallLetter);
	}
}
