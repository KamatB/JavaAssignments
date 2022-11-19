package com.data.structures.array;

import java.util.Arrays;

/**
 * @author CKamat
 */
public class RotateArray {
    public static void main(String[] args) {
      int[] arr= {10,20,30,40,50,60,70}; // 40,50,60,70,10,20,30
      System.out.println(Arrays.toString(rotateArray(arr, 3)));
    }

    public static int[] rotateArray(int[] arr,int k){
        int j=0;
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for (j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        return arr;
    }
}
