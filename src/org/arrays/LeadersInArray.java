package org.arrays;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 6, 5, 2 };

        bruteForceApproach(arr);
        bestApproach(arr);
    }

    private static void bestApproach(int[] arr) {
        int max = arr[arr.length -1];
        for (int j = arr.length - 1; j>0; j--) {
            if(max < arr[j]){
                max = arr[j];
                System.out.println(arr[j]);
            }
                
        }
    }

    private static void bruteForceApproach(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(arr[i]);
        }
    }
}
