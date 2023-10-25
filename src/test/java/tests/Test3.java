package tests;

public class Test3 {

	public static void main(String[] args) {
		String str = "Hello World";// World Hello
		String[] words = str.split(" ");
		StringBuilder reverse = new StringBuilder();
		reverse.append("");
		
		for(int i=words.length-1; i>=0; i--) {
			reverse.append(words[i]);
			if(i>0) {
				reverse.append(" ");
			}
		}
		System.out.println(reverse);

	}

}
