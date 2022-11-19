package com.data.structures.array;

import java.util.Arrays;

/**
 * @author CKamat
 */
public class ReplaceNumber {
    public static void main(String[] args) {
        int[] arr= {2,4,6,3,8,5};
        // int[] newArr=replaceTheNumber(arr);
        //System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(replaceTheNum(arr)));

    }

    private static int[] replaceTheNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[i]=arr[i]*arr[i+1];
            }else if(i== arr.length-1){
                arr[i]=arr[i]*arr[i-1];
            }else{
                arr[i]=arr[i-1]*arr[i+1];
            }
        }
        return arr;
    }

    private static int[] replaceTheNum(int[] arr) {
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                newArr[i]=arr[i]*arr[i+1];
            }else if(i== arr.length-1){
                newArr[i]=arr[i]*arr[i-1];
            }else{
                newArr[i]=arr[i-1]*arr[i+1];
            }
        }
        return newArr;
    }
}
