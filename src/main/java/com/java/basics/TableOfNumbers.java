package com.java.basics;

import java.util.Scanner;

/**
 * @author CKamat
 */
public class TableOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of which the tables to be printed");
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
