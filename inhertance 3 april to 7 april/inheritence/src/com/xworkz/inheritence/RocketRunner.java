package com.xworkz.inheritence;

public class RocketRunner {
    public static void main(String[] args) {

        System.out.println("=== Parent class object ===");
        Rocket rocket = new Rocket();
        rocket.launch();
        rocket.refuel();
        rocket.navigate();
        rocket.shutdown();
        rocket.inspect();

        System.out.println("\n=== Child class object with parent reference ===");
        Rocket subRocket = new SubClassRocket();
        subRocket.launch();
        subRocket.refuel();
        subRocket.navigate();
        subRocket.shutdown();
        subRocket.inspect();

        System.out.println("\n=== Child class object ===");
        SubClassRocket subclassRocket = new SubClassRocket();
        subclassRocket.launch();
        subclassRocket.refuel();
        subclassRocket.navigate();
        subclassRocket.shutdown();
        subclassRocket.inspect();
        subclassRocket.boost(); // Child-specific method
    }
}
