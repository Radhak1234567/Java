package com.xworkz.inheritence;

public class BlazeRunner {public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Blaze blaze = new Blaze();
    blaze.ignite();
    blaze.spread();
    blaze.extinguish();
    blaze.heat();
    blaze.smoke();

    System.out.println("\n=== Child class object with parent reference (Upcasting) ===");
    Blaze blazeRef = new Flame(); // Upcasting
    blazeRef.ignite();
    blazeRef.spread();
    blazeRef.extinguish();
    blazeRef.heat();
    blazeRef.smoke();

    // Downcasting to call child-specific method
    if (blazeRef instanceof Flame) {
        Flame fireBlaze = (Flame) blazeRef;
        fireBlaze.intensity();
    }

    System.out.println("\n=== Child class object ===");
    Flame fireBlaze = new Flame();
    fireBlaze.ignite();
    fireBlaze.spread();
    fireBlaze.extinguish();
    fireBlaze.heat();
    fireBlaze.smoke();
    fireBlaze.intensity();
}
}
