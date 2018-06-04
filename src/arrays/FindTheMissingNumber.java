package arrays;

public class FindTheMissingNumber {

	public static void main(String[] args) {

		int arrayInput[] = new int[] { 1, 2, 3, 5, 6};

		int arrResultBestCase = usingBestCase(arrayInput);
		System.out.println("Using Best method..." + arrResultBestCase);
	}

	private static int usingBestCase(int[] arrayInput) {
		
		int sumOfNaturalNumberArray=0;
		int n =arrayInput.length +1;
		int sumOfNaturalNumber= (n*(n+1))/2;
		
		for (int i = 0; i < arrayInput.length; i++) {
			sumOfNaturalNumberArray = arrayInput[i] + sumOfNaturalNumberArray;
		}
		return (sumOfNaturalNumber - sumOfNaturalNumberArray);
	}
}