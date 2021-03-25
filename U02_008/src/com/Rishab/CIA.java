package com.Rishab;

public class CIA extends Student implements Exam{


    CIA(String n,
        int r,
        int c1,
        int c2) {
        super(n, r, c1, c2);
    }

    public CIA() {
        super();
    }
    public void display() {
        System.out.println("Name: " +name);
        System.out.println("Roll Number: " +roll_no);
        System.out.println("CIA 1: " +CIA_1);
        System.out.println("CIA 2: " +CIA_2);
    }
}
