package com.xworkz.inheritence;

public class KitchenAppliance extends Appliance {

    @Override
    void method1() {
        System.out.println("KitchenAppliance: Used in kitchen");
    }

    @Override
    void method2() {
        System.out.println("KitchenAppliance: Energy efficient");
    }

    @Override
    void method3() {
        System.out.println("KitchenAppliance: Helps in cooking");
    }

    @Override
    void method4() {
        System.out.println("KitchenAppliance: Needs regular cleaning");
    }

    @Override
    void method5() {
        System.out.println("KitchenAppliance: Includes ovens, toasters, blenders");
    }

    // Child-specific method
    void specialFeature() {
        System.out.println("KitchenAppliance: Special feature - Smart cooking modes");
    }

}
