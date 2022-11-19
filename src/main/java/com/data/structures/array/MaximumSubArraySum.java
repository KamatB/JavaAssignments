package com.data.structures.array;

/**
 * @author CKamat
 */
public class MaximumSubArraySum {
    public static void main(String[] args) {
      int[] arr={1,-2,-6,3,-10,2,4,8,-12};
      int maxSum=maxSubArraySum(arr);
      System.out.println(maxSum);
    }

    public static int maxSubArraySum(int[] arr){
        int max_sum=0,sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(sum>max_sum) {
                 max_sum = sum;
             }
             if(sum<0){
                 sum=0;
             }
        }
        return max_sum;
    }
}

