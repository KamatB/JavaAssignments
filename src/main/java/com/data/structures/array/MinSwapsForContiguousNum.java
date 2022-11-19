package com.data.structures.array;

import static java.lang.Math.min;

/**
 * @author CKamat
 */
public class MinSwapsForContiguousNum {
    public static void main(String[] args) {
        int[] arr={1,6,9,4,7,12,3}; //2,1,4,7,6,3
        int minSwap=minimumSwapCount(arr,5);
        System.out.println("The minimum swap required to get the numbers together for given array is -> "+minSwap);
    }

    public static int minimumSwapCount(int[] arr,int k){
        int count=0;
        int minSwap=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                count++;
            }
        }

        for(int i=0;i<count;i++){
            if(arr[i]>k) minSwap++;
        }
        int ans=minSwap;

        for(int j=1,l=count+1;j<arr.length && l< arr.length;j++,l++){
              if(arr[j]>k){
                   minSwap--;
              }
              if(arr[l]>k){
                  minSwap++;
              }
              ans=min(ans,minSwap);
        }
        return minSwap;
    }
}
