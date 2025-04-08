package com.xworkz.inheritence;

public class BeveragesRunner {  public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Beverages beverages = new Beverages();
    beverages.prepare();
    beverages.serve();
    beverages.drink();
    beverages.clean();
    beverages.enjoy();

    System.out.println("\n=== Child class object with parent reference (Upcasting) ===");
    Beverages beveragesRef = new Juice(); // Upcasting
    beveragesRef.prepare();
    beveragesRef.serve();
    beveragesRef.drink();
    beveragesRef.clean();
    beveragesRef.enjoy();

    // Downcasting to access child specific method
    if (beveragesRef instanceof Juice) {
        Juice juice = (Juice) beveragesRef; // Downcasting
        juice.addIce();
    }

    System.out.println("\n=== Child class object ===");
    Juice juice = new Juice();
    juice.prepare();
    juice.serve();
    juice.drink();
    juice.clean();
    juice.enjoy();
    juice.addIce();
}
}
