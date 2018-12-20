package gfg.gfg.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 5 };

		System.out.println(findMissingNumber(input));
	}

	private static int findMissingNumber(int[] input) {

		int n = input.length;
		
		int sum = (n + 1) * (n + 2) / 2;

		for (int i = 0; i < input.length; i++) {

			sum -= input[i];
		}

		return sum;
	}

}
