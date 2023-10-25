package tests;

public class Test2 {

	public static void main(String[] args) {
		
		String str = "Automation";// remove vowels
		String withoutVowels = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
					ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				withoutVowels = withoutVowels+ch;
			}
		}
		System.out.println(withoutVowels);

	}

}
