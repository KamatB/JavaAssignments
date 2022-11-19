package com.java.basics;

/**
 * @author CKamat
 */
public class StudentAadhar extends Student{
    private long aadharNum;

    public StudentAadhar(String name, int rollNo, String address) {
        super(name, rollNo, address);
    }

    public long getAadharNum() {
        return aadharNum;
    }

    public void setAadharNum(long aadharNum) {
        this.aadharNum = aadharNum;
    }
}
