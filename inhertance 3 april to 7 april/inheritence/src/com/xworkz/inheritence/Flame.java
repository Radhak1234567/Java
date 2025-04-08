package com.xworkz.inheritence;

public class Flame extends Blaze {
    public Flame() {
    super();
    System.out.println("No-arg constructor of FireBlaze");
}

    @Override
    public void ignite() {
        System.out.println("FireBlaze is igniting rapidly - FireBlaze class");
    }

    @Override
    public void spread() {
        System.out.println("FireBlaze is spreading fiercely - FireBlaze class");
    }

    @Override
    public void extinguish() {
        System.out.println("FireBlaze is difficult to extinguish - FireBlaze class");
    }

    @Override
    public void heat() {
        System.out.println("FireBlaze is producing intense heat - FireBlaze class");
    }

    @Override
    public void smoke() {
        System.out.println("FireBlaze is producing dense smoke - FireBlaze class");
    }

    // Child-specific method
    public void intensity() {
        System.out.println("FireBlaze has extreme intensity - FireBlaze class");
    }
}
