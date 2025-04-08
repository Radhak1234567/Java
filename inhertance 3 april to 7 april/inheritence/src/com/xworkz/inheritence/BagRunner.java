package com.xworkz.inheritence;

public class BagRunner {public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Bag bag = new Bag();
    bag.method1();
    bag.method2();
    bag.method3();
    bag.method4();
    bag.method5();

    System.out.println("\n=== Child class object with parent reference ===");
    Bag bagRef = new SubClassBag();
    bagRef.method1();
    bagRef.method2();
    bagRef.method3();
    bagRef.method4();
    bagRef.method5();

    System.out.println("\n=== Child class object with child reference ===");
    SubClassBag subBag = new SubClassBag();
    subBag.method1();
    subBag.method2();
    subBag.method3();
    subBag.method4();
    subBag.method5();
    subBag.tea(); // Child-specific method
    System.out.println("\n=== Downcasting from parent reference to child ===");
    if (bagRef instanceof SubClassBag) {  // ✅ correct check
        SubClassBag downcastedBag = (SubClassBag) bagRef; // ✅ proper casting
        downcastedBag.tea(); // ✅ child-specific method after downcasting
    }}



}
