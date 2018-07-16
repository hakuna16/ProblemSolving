package org.arrays;

public class MajorityElement {

    public static void main(String[] args) {

        int arr[] = { 2,3,2,2,3, 3, 4, 2, 4, 4, 2, 4, 4 ,2 ,2, };

        int majorityUsingSimpleApproach = bruteForceApproach(arr);
        System.out.println(majorityUsingSimpleApproach);

    }

    private static int bruteForceApproach(int[] arr) {
        int count = 0;
        int majority = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (count == 0 || count > 0)
                        count++;
                }
                majority = arr[i];
            }
        }
        return majority;
    }
}
