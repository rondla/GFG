package gfg.gfg.string;

import java.util.Arrays;

public class PermutaionOfGivenString {
	
	
	public static void main(String[] args) {
	//	permutation("ABC");
		char sChar[] = ("abc").toCharArray();
		char sChar2[] = ("bca").toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(sChar2);
		
		if(Arrays.equals(sChar, sChar2)) {
			System.out.println("True");
		}
		
	}

	
	private static void permutation(String s ) {
		
	char sChar[] = ("abc").toCharArray();
	char sChar2[] = ("bca").toCharArray();
	
	Arrays.sort(sChar);
	Arrays.sort(sChar2);
	
	if(sChar.equals(sChar2)) {
		
		System.out.println("True");
		
	}
	
	}
}
