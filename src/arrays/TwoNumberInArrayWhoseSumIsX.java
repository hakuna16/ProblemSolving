package arrays;

import java.util.HashSet;

public class TwoNumberInArrayWhoseSumIsX {

	public static void main(String[] args) {

		int arrInt[] = new int[] { 2, 6, 1, 7, 9, 10, 15, 16, 11, 3, 4 };

		int x = 10;

		// brute Force Method
		int arrResultBruteForce[] = bruteForceApproach(arrInt, x);
		System.out.println("Using Brute Force method..." + arrResultBruteForce[0] + "........" + arrResultBruteForce[1]);

		int arrResultUsingSet[] = usingSet(arrInt, x);
		System.out.println("Using Set method..." + arrResultUsingSet[0] + "........" + arrResultUsingSet[1]);

		int arrResultBestCase[] = usingBestCase(arrInt, x);
		System.out.println("Using Best method..." + arrResultBestCase[0] + "........" + arrResultBestCase[1]);

	}

	private static int[] usingBestCase(int[] arrInt, int x) {
		
		int firstElement = arrInt[0];
		int lastElement = arrInt[arrInt.length-1];
		int sum = 0;
		
		
		for (int i = 1; i < arrInt.length; i++) {
			sum = firstElement + lastElement;

			if(sum == x)
			break;
			
			if(sum <= x){
				firstElement = arrInt[i];
			}else {
				lastElement = arrInt[arrInt.length -i++];
			}
		}
		
		return new int[] { firstElement, lastElement };
	}

	private static int[] usingSet(int[] arrInt, int x) {

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

	private static int[] bruteForceApproach(int[] arrInt, int x) {

		int sum = 0;

		int firstNumber = 0;
		int secondNumber = 0;

		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i; j < arrInt.length; j++) {
				sum = arrInt[i] + arrInt[j];
				if (sum == x) {
					firstNumber = arrInt[i];
					secondNumber = arrInt[j];
				}
			}
		}
		return new int[] { firstNumber, secondNumber };
	}
}
