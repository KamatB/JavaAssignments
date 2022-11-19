package com.data.structures.array;

import java.util.Scanner;

/**
 * @author CKamat
 */
public class MinimumDistance {

    public static void main(String[] args) {
        int[] arr= {2,4,6,3,8,5,2,3};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNum=scanner.nextInt();
        System.out.println(findMinDistanceBetweenNumbers(arr,firstNum,secondNum));

    }

    public static int findMinDistanceBetweenNumbers(int[] arr,int firstNum, int secondNum){
        int i=0, min_distance= arr.length, prev=-1;
        for(;i<arr.length;i++){
            if(arr[i]==firstNum||arr[i]==secondNum){
                prev=i;
                break;
            }
        }

        for( ;i<arr.length;i++){
            if(arr[i]==firstNum || arr[i]==secondNum){
                if(arr[prev]!=arr[i] && (i-prev) < min_distance){
                    min_distance=i-prev;
                }
                prev=i;

            }
        }
        return min_distance;
    }
}
