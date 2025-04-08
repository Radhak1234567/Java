package com.xworkz.inheritence;

public class Juice extends Beverages
{  public Juice() {
    super();
    System.out.println("No-arg constructor of Juice");
}

    @Override
    public void prepare() {
        System.out.println("Preparing juice in Juice");
    }

    @Override
    public void serve() {
        System.out.println("Serving juice in Juice");
    }

    @Override
    public void drink() {
        System.out.println("Drinking juice in Juice");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning juice glasses in Juice");
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoying juice in Juice");
    }

    // Child specific method
    public void addIce() {
        System.out.println("Adding ice to juice in Juice");
    }
}
