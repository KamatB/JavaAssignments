package com.java.basics;


import java.util.Scanner;

/**
 * @author CKamat
 */
public class BoxSample {

    public int areaOfBox(int length, int width){
        return length*width;
    }

    public void area(int length, int width){
       System.out.println(length*width);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of box");
        int length=scanner.nextInt();
        System.out.println("Enter the width of box");
        int width=scanner.nextInt();
        BoxSample box1=new BoxSample();
        BoxSample box2=new BoxSample();
        BoxSample box3=new BoxSample();
        BoxSample box4=new BoxSample();
        System.out.println(box1.areaOfBox(10,20));
        System.out.println(box2.areaOfBox(5,10));
        box3.area(length,width);
        box4.area(length,width);
    }
}
