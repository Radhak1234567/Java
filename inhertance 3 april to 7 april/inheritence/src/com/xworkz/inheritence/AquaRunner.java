package com.xworkz.inheritence;

public class AquaRunner {public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Aqua aqua = new Aqua();
    aqua.method1();
    aqua.method2();
    aqua.method3();
    aqua.method4();
    aqua.method5();

    System.out.println("\n=== Child class object with parent reference ===");
    Aqua aquaRef = new SubAqua();
    aquaRef.method1();
    aquaRef.method2();
    aquaRef.method3();
    aquaRef.method4();
    aquaRef.method5();

    System.out.println("\n=== Child class object ===");
    SubAqua subAqua = new SubAqua();
    subAqua.method1();
    subAqua.method2();
    subAqua.method3();
    subAqua.method4();
    subAqua.method5();
    subAqua.childSpecificMethod();
    if (aquaRef instanceof SubAqua) {
        SubAqua subAquaRef = (SubAqua) aquaRef;
        subAquaRef.childSpecificMethod();
    }
}
}
