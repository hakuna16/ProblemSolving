package org.arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * This problem explain as.
 * 
 * Input arr[] = {1,2}, x=1 and y=2 Output: Minimum Distance is 1
 * 
 * Input arr[] = {3,4,5}, x=3 and y=5 Output: Minimum Distance is 2
 * 
 * Input arr[] = {3,5,4,2,6,5,6,5,4,8,3}, x=3 and y=6 Output: Minimum Distance
 * is 4
 * 
 * Input arr[] = {2,5,3,5,4,4,2,3}, x=3 and y=2 Output: Minimum Distance is 1
 */
public class MinimumDistanceBetweenTwoNumbersInUnSortedArray {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 6, 2, 6, 5, 6, 5, 4, 8, 3 };
        int x = 3;
        int y = 6;

        int minDis = bruteForceApproach(arr, x, y);
        System.out.println("brute Force Approach: " + minDis);
        
        int minDisTance = bestApproach(arr, x, y);
        System.out.println(minDisTance);
    }

    private static int bestApproach(int[] arr, int x, int y) {
        
        return 0;
    }

    private static int bruteForceApproach(int[] arr, int x, int y) {
        int dis = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == x && arr[j] == y) || (arr[j] == x && arr[i] == y) && dis > Math.abs(i - j)) {
                    dis = Math.abs(i - j);
                }
            }
        }
        return dis;
    }

}
