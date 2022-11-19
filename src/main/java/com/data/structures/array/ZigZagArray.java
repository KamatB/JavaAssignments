package com.data.structures.array;

/**
 * @author CKamat
 */
public class ZigZagArray {
    public static void main(String[] args) {
        int[] arr= {2,4,6,3,8,5,9};
       // System.out.println(zigZagArray(arr));
        System.out.println(zigZag(arr));
    }

    public static int[] zigZagArray(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            if(!(arr[i]<arr[i+1])){
                swap(arr[i],arr[i+1]);
            }
            if(!(arr[i+1]>arr[i+2])){
                swap(arr[i+1],arr[i+2]);
            }
        }
        return arr;
    }

    public static int[] zigZag(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0 && !(arr[i]<arr[i+1])){
                swap(arr[i],arr[i+1]);
            }else if(i%2!=0 && !(arr[i]>arr[i+1])){
                swap(arr[i],arr[i+1]);
            }
        }
        return arr;
    }

    public static void swap(int num1,int num2){
         num1=num1+num2;
         num2=num1-num2;
         num1=num1-num2;
    }
}
