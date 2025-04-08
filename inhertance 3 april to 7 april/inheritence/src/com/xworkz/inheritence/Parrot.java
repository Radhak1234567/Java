package com.xworkz.inheritence;

public class Parrot extends Birds {

    public Parrot() {
        super();
        System.out.println("No-arg constructor of Parrot");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying gracefully - Parrot class");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating fruits - Parrot class");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping on a tree - Parrot class");
    }

    @Override
    public void chirp() {
        System.out.println("Parrot is chirping sweetly - Parrot class");
    }

    @Override
    public void buildNest() {
        System.out.println("Parrot is building a nest in the tree - Parrot class");
    }

    // Child-specific method
    public void mimic() {
        System.out.println("Parrot is mimicking sounds - Parrot class");
    }
}
