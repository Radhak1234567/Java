package com.xworkz.inheritence;

public class BirdsRunner { public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Birds bird = new Birds();
    bird.fly();
    bird.eat();
    bird.sleep();
    bird.chirp();
    bird.buildNest();

    System.out.println("\n=== Child class object with parent reference (Upcasting) ===");
    Birds birdRef = new Parrot(); // Upcasting
    birdRef.fly();
    birdRef.eat();
    birdRef.sleep();
    birdRef.chirp();
    birdRef.buildNest();

    // Downcasting to access child specific method
    if (birdRef instanceof Parrot) {
        Parrot parrot = (Parrot) birdRef; // Downcasting
        parrot.mimic();
    }

    System.out.println("\n=== Child class object ===");
    Parrot parrot = new Parrot();
    parrot.fly();
    parrot.eat();
    parrot.sleep();
    parrot.chirp();
    parrot.buildNest();
    parrot.mimic();
}
}
