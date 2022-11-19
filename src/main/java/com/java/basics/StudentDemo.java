package com.java.basics;

/**
 * @author CKamat
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student=new Student("Chaitra",20,"Bengaluru");
        student.setAge(16);
        System.out.println(student);
        student.setName("Kite");
        System.out.println(student);
        StudentAadhar studentAadhar=new StudentAadhar("Chaitra",20,"Bengaluru");
        studentAadhar.setAadharNum(121345);
        System.out.println(studentAadhar);
    }
}
