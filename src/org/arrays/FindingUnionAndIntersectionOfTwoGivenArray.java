package org.arrays;

public class FindingUnionAndIntersectionOfTwoGivenArray {

	public static void main(String[] args) {

		int arrayInteger[] = new int[] { 1, 5, 6, 8 };

		int arrayInteger2[] = new int[] { 1, 2, 3, 5, 6, 7, 8 };

		int sizeOfArray1 = arrayInteger.length;
		int sizeOfArray2 = arrayInteger2.length;

		System.out.println("Printing Result for Intersection: ");
		bruteForceApproachForIntersection(arrayInteger, arrayInteger2, sizeOfArray1, sizeOfArray2);

		System.out.println("Printing Result for Union : ");
		bruteForceApproachForUnion(arrayInteger, arrayInteger2, sizeOfArray1, sizeOfArray2);
	}

	private static void bruteForceApproachForIntersection(int[] arrayInteger, int[] arrayInteger2, int sizeOfArray1,
			int sizeOfArray2) {
		int j;
		int i = j = 0;
		while (i < sizeOfArray1 && j < sizeOfArray2) {
			if (arrayInteger[i] < arrayInteger2[j]) {
				i++;
			} else if (arrayInteger2[j] < arrayInteger[i]) {
				j++;
			} else {
				System.out.println(arrayInteger[i]);
				i++;
				j++;
			}
		}
	}

	private static void bruteForceApproachForUnion(int[] arrayInteger, int[] arrayInteger2, int sizeOfArray1,
			int sizeOfArray2) {
		int j;
		int i = j = 0;
		while (i < sizeOfArray1 && j < sizeOfArray2) {
			if (arrayInteger[i] < arrayInteger2[j]) {
				System.out.println(arrayInteger[i]);
				i++;
			} else if (arrayInteger2[j] < arrayInteger[i]) {
				System.out.println(arrayInteger2[j]);
				j++;
			} else {
				System.out.println(arrayInteger[i]);
				i++;
				j++;
			}
		}
		while (i < sizeOfArray1) {
			System.out.println(arrayInteger[i]);
			i++;
		}
		while (j < sizeOfArray2) {
			System.out.println(arrayInteger2[j]);
			j++;
		}
	}
}
