package com.xworkz.encapsulation;

public class StaticRunner {
    public static void main(String[] args) {
        System.out.println("Main method starts");

        Static obj1 = new Static();
        obj1.displayCount();

        Static obj2 = new Static();
        obj2.displayCount();
    }
}
