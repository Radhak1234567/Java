package com.xworkz.inheritence;

public class SubClassBag extends Bag {  public SubClassBag() {
    System.out.println("No-arg constructor of SubClassBag");
}

    public void tea() {
        System.out.println("Running tea method in SubClassBag");

        super.method1();
        super.method2();
        super.method3();
        super.method4();
        super.method5();
    }

    @Override
    public void method1() {
        System.out.println("Overridden method1 in SubClassBag");
    }

    @Override
    public void method2() {
        System.out.println("Overridden method2 in SubClassBag");
    }

    @Override
    public void method3() {
        System.out.println("Overridden method3 in SubClassBag");
    }

    @Override
    public void method4() {
        System.out.println("Overridden method4 in SubClassBag");
    }

    @Override
    public void method5() {
        System.out.println("Overridden method5 in SubClassBag");
    }}
