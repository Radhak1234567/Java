package com.xworkz.inheritence;

public class SubAqua extends Aqua {
    @Override
    public void method1() { System.out.println("SubAqua method1"); }

    @Override
    public void method2() { System.out.println("SubAqua method2"); }

    @Override
    public void method3() { System.out.println("SubAqua method3"); }

    @Override
    public void method4() { System.out.println("SubAqua method4"); }

    @Override
    public void method5() { System.out.println("SubAqua method5"); }

    public void childSpecificMethod() {
        System.out.println("SubAqua specific method");
    }
}
