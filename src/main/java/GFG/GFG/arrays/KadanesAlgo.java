package gfg.gfg.arrays;

/**
 * @author kiranrondla
 *
 *         Problem Statement : Given an array of both positive and negative
 *         integers find contiguous sub array with maximum sum
 */
public class KadanesAlgo {

	public static void main(String[] args) {

		int givenArray[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum Sum Is " + conSubArrayWithMaximumSum(givenArray));

	}

	/**
	 * This method gives us the contiguous sub array with maximum sum. we initialize
	 * 2 variables maxsofar and maxEndingHere with 0; then iterate over the array
	 * and add elements up if the maxEndingHere is less than 0 then we make it zero
	 * 
	 * @param givenArray
	 * @return the maximum sum.
	 */
	private static int conSubArrayWithMaximumSum(int[] givenArray) {
		int maxSofar = 0;
		int maxEndingHere = 0;
		for (int i = 0; i < givenArray.length; i++) {

			maxEndingHere = maxEndingHere + givenArray[i];
			if (maxSofar < maxEndingHere) {
				maxSofar = maxEndingHere;
			}
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
		}
		return maxSofar;
	}

}
