package com.xworkz.inheritence;

public class SubClassAiroplane extends Airoplane {


    @Override
    public void fly() {
        System.out.println("JetPlane is flying at high speed");
    }

    @Override
    public void roam() {
        System.out.println("JetPlane is roaming across continents");
    }

    @Override
    public void travel() {
        System.out.println("JetPlane is travelling fast");
    }

    @Override
    public void world() {
        System.out.println("JetPlane is flying around the world");
    }

    @Override
    public void nature() {
        System.out.println("JetPlane is experiencing nature at high altitude");
    }

    public void supersonicSpeed() {
        System.out.println("JetPlane has supersonic speed");
    }
}