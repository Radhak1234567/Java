package com.xworkz.inheritence;

public class AnimalRunner {public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Animal animal = new Animal();
    animal.method1();
    animal.method2();
    animal.method3();
    animal.method4();
    animal.method5();

    System.out.println("\n=== Child class object with parent reference ===");
    Animal dogAsAnimal = new Dog();
    dogAsAnimal.method1();
    dogAsAnimal.method2();
    dogAsAnimal.method3();
    dogAsAnimal.method4();
    dogAsAnimal.method5();

    System.out.println("\n=== Child class object ===");
    Dog dog = new Dog();
    dog.method1();
    dog.method2();
    dog.method3();
    dog.method4();
    dog.method5();
    dog.bark(); // Child specific method
    if (dogAsAnimal instanceof Dog) {
        Dog downcastedDog = (Dog) dogAsAnimal;
        downcastedDog.bark();
    } else {
        System.out.println("Downcasting not possible");
    }}
}
