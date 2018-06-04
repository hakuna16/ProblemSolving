package arrays;

public class TwoNumberInArrayWhoseSumIsX {

	public static void main(String[] args) {
		
		int arrInt[] = new int[] {2,5,6,1,7,9,10,15,16,11,3,4};
		
		int x = 10;
		
		//brute Force Method
		
		int arrResultBruteForce[] = bruteForceApproach(arrInt,x);
		
		int arrResultUsingSet[] = usingSet(arrInt,x);
		
		int arrResultBestCase[] = usingBestCase(arrInt,x);
		
	}

	private static int[] usingBestCase(int[] arrInt, int x) {
		return arrInt;
	}

	private static int[] usingSet(int[] arrInt, int x) {
		return arrInt;
	}

	private static int[] bruteForceApproach(int[] arrInt, int x) {
		
		return arrInt;
		
	}
}
