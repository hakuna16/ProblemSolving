package org.arrays;

import java.util.Arrays;
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
		
		int arrInt2[] = new int[] { 9, 7, 11, 15, 16, 3,20,4, 25, };
		int arrResultUsingSet2[] = usingSet(arrInt2, 1);
		System.out.println("Using Set method..." + arrResultUsingSet2[0] + "........" + arrResultUsingSet2[1]);

		
		int arrResultBestCase[] = usingBestCase(arrInt, x);
		 System.out.println("Using Best method..." + arrResultBestCase[0] + "........" + arrResultBestCase[1]);
		 
		 int arrInt1[] = new int[] { 7, 9, 10, 15, 16, 11, 3,20,4, 25, };
			int arrResultBestCase1[] = usingBestCase(arrInt1, x);
			System.out.println("Using Best method..." + arrResultBestCase1[0] + "........" + arrResultBestCase1[1]);

	}

	private static int[] usingBestCase(final int[] arrInt, final int x) {

		int firstElement = 0;
		int lastElement = 0;
		int diff = 0;

		Arrays.sort(arrInt);

		for (int i = 0, j = 1; i < arrInt.length;) {

			diff = arrInt[j] - arrInt[i]; 
			if (diff == x) {
				firstElement = arrInt[i];
				lastElement = arrInt[j];
				break;
			}
			if (diff <= x) {
				j++;
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
		int sum;
		for (int i = 0; i < arrInt.length; i++) {
			sum = arrInt[i] + x;
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
