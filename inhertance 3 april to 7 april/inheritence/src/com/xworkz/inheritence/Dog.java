package com.xworkz.inheritence;

public class Dog  extends Animal {
    @Override
    void method1() {
        System.out.println("Dog: Lives with humans");
    }

    @Override
    void method2() {
        System.out.println("Dog: Eats dog food");
    }

    @Override
    void method3() {
        System.out.println("Dog: Runs fast");
    }

    @Override
    void method4() {
        System.out.println("Dog: Gives birth to puppies");
    }

    @Override
    void method5() {
        System.out.println("Dog: Breathes with lungs");
    }

    // Child specific method
    void bark() {
        System.out.println("Dog: Barks loudly");
    }
}
