package com.data.structures.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.min;

/**
 * @author CKamat
 */
public class MaxCountOfNumInTheRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of ranges to be provided");
        int n = scanner.nextInt();
        int[] l1=new int[n];
        int[] r1=new int[n];
        for (int i = 0; i < n; i++) {
            l1[i]= scanner.nextInt();
            r1[i]= scanner.nextInt();
        }
        System.out.println("l1 -> "+ Arrays.toString(l1)+", r1 -> "+ Arrays.toString(r1));
    }

//    public static int maxCountOfTheNumber(int[] l1, int[] r1) {
//
//    }
}
