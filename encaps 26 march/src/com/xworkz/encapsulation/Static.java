package com.xworkz.encapsulation;

public class Static {
    static int count;


    static {
        System.out.println("Static block executed!");
        count = 100;
    }


    public Static() {
        System.out.println("Count");
    }


    public void displayCount() {
        System.out.println("Count: " + count);
    }
}

