package arrays;

import java.util.HashSet;

public class TwoNumberInArrayWhoseDiffrenceIsX {

	public static void main(String[] args) {

		int arrInt[] = new int[] { 2, 6, 1, 7, 9, 10, 15, 16, 11, 3, 4 };

		int x = 10;

		// brute Force Method
		int arrResultBruteForce[] = bruteForceApproach(arrInt, x);
		System.out
				.println("Using Brute Force method..." + arrResultBruteForce[0] + "........" + arrResultBruteForce[1]);

		int arrResultUsingSet[] = usingSet(arrInt, x);
		System.out.println("Using Set method..." + arrResultUsingSet[0] + "........" + arrResultUsingSet[1]);

		int arrResultBestCase[] = usingBestCase(arrInt, x);
		 System.out.println("Using Best method..." + arrResultBestCase[0] + "........" + arrResultBestCase[1]);

	}

	private static int[] usingBestCase(final int[] arrInt, final int x) {

		int firstElement = arrInt[0];
		int secondElement = arrInt[1];
		int diff = 0;

		for (int i = 1; i < arrInt.length; i++) {
			diff = Math.abs(firstElement - secondElement);

			if (diff == x)
				break;

			if (diff <= x) {
				firstElement = arrInt[i];
			} else {
				secondElement = arrInt[arrInt.length - i++];
			}
		}

		return new int[] { firstElement, secondElement };
	}

	private static int[] usingSet(final int[] arrInt, final int x) {

		int firstNumber = 0;
		int secondNumber = 0;

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arrInt.length; i++) {
			set.add(arrInt[i]);
		}
		int sum;
		for (int i = 0; i < arrInt.length; i++) {
			sum = Math.abs(arrInt[i] + x);
			if (set.contains(sum)) {
				firstNumber = arrInt[i];
				secondNumber = sum;
				break;
			}
		}
		return new int[] { firstNumber, secondNumber };
	}

	private static int[] bruteForceApproach(final int[] arrInt, final int x) {

		int diff = 0;

		int firstNumber = 0;
		int secondNumber = 0;

		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i; j < arrInt.length; j++) {
				diff = Math.abs(arrInt[i] - arrInt[j]);
				if (diff == x) {
					firstNumber = arrInt[i];
					secondNumber = arrInt[j];
				}
			}
		}
		return new int[] { firstNumber, secondNumber };
	}

}
