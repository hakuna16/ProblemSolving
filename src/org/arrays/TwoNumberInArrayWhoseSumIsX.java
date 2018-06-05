package org.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberInArrayWhoseSumIsX {

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

		int arrInt1[] = new int[] { 7, 9, 10, 15, 16, 11, 3, 4 };
		int arrResultBestCase1[] = usingBestCase(arrInt1, x);
		System.out.println("Using Best method..." + arrResultBestCase1[0] + "........" + arrResultBestCase1[1]);

	}

	private static int[] usingBestCase(final int[] arrInt, final int x) {

		int firstElement = 0;
		int lastElement = 0;
		int sum = 0;

		Arrays.sort(arrInt);

		for (int i = 0, j = arrInt.length - 1; i < arrInt.length;) {

			sum = arrInt[i] + arrInt[j];
			if (sum == x) {
				firstElement = arrInt[i];
				lastElement = arrInt[j];
				break;
			}
			if (sum >= x) {
				j--;
				firstElement = arrInt[i];
				lastElement = arrInt[j];
			} else {
				i++;
				firstElement = arrInt[i];
				lastElement = arrInt[j];
			}
		}

		return new int[] { firstElement, lastElement };
	}

	private static int[] usingSet(final int[] arrInt, final int x) {

		int firstNumber = 0;
		int secondNumber = 0;

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arrInt.length; i++) {
			set.add(arrInt[i]);
		}
		int diff;
		for (int i = 0; i < arrInt.length; i++) {
			diff = Math.abs(arrInt[i] - x);
			if (set.contains(diff)) {
				firstNumber = arrInt[i];
				secondNumber = diff;
				break;
			}
		}
		return new int[] { firstNumber, secondNumber };
	}

	private static int[] bruteForceApproach(final int[] arrInt, final int x) {

		int sum = 0;

		int firstNumber = 0;
		int secondNumber = 0;

		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i; j < arrInt.length; j++) {
				sum = arrInt[i] + arrInt[j];
				if (sum == x) {
					firstNumber = arrInt[i];
					secondNumber = arrInt[j];
					break;
				}
			}
		}
		return new int[] { firstNumber, secondNumber };
	}
}
