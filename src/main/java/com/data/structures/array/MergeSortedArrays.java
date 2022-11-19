package com.data.structures.array;

import java.util.Arrays;

/**
 * @author CKamat
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] largeArray = {1, -1, 5, -1, -1, 10, -1};
        int[] subarray = {3, 9, 12, 14};
        System.out.println(Arrays.toString(mergeSortedArrays(largeArray, subarray)));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == -1) {
                arr1[i] = arr2[j];
                arr2[j] = -1;
            }
            if (j < arr2.length && arr2[j] == -1) {
                j++;
            }
        }

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
        }
        return arr1;
    }
}
