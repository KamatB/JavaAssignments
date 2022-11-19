package com.data.structures.array;

import java.util.Arrays;

/**
 * @author CKamat
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {2,4,6,3,8,5};
        Arrays.sort(arr);
        int missingNumber=MissingNumber.missingNum(arr);
        System.out.println(missingNumber);

    }

    public static int missingNum(int[] numArr){
        int num=0;
        for(int i=1;i<= numArr.length;i++){
            if(numArr[i+1]-numArr[i]!=1){
                num = numArr[i]+1;
                break;
            }
        }
        return num;
    }

}
