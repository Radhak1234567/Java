package com.xworkz.inheritence;

public class KitchenAppliance extends Appliance {
    @Override
    public void method1() { System.out.println("KitchenAppliance method1"); }

    @Override
    public void method2() { System.out.println("KitchenAppliance method2"); }

    @Override
    public void method3() { System.out.println("KitchenAppliance method3"); }

    @Override
    public void method4() { System.out.println("KitchenAppliance method4"); }

    @Override
    public void method5() { System.out.println("KitchenAppliance method5"); }

    public void specialFeature() {
        System.out.println("KitchenAppliance special feature!");
    }
}
