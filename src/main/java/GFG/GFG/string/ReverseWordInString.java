package gfg.gfg.string;

public class ReverseWordInString {
	
	public static void main(String[] args) {
		
		reverse("Lets Get Coding");
		
	}
	
	private static String reverse(String str) {

		String s[] = str.split(" ");
		for (int i = s.length-1; i >=0; i--) {
			
			System.out.println(s[i]);
			
		}
		
		return null;
	}

}
