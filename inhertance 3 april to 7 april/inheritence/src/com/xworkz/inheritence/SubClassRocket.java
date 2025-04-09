package com.xworkz.inheritence;

public class SubClassRocket extends Rocket {

    @Override
    public void launch() {
        System.out.println("Subclass Rocket launch overridden");
    }

    @Override
    public void refuel() {
        System.out.println("Subclass Rocket refuel overridden");
    }

    @Override
    public void navigate() {
        System.out.println("Subclass Rocket navigate overridden");
    }

    @Override
    public void shutdown() {
        System.out.println("Subclass Rocket shutdown overridden");
    }

    @Override
    public void inspect() {
        System.out.println("Subclass Rocket inspect overridden");
    }

    public void boost() {
        System.out.println("Subclass Rocket boost mode");
    }
}
