package com.xworkz.inheritence;

public class ApplianceRunner { public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Appliance appliance = new Appliance();
    appliance.method1();
    appliance.method2();
    appliance.method3();
    appliance.method4();
    appliance.method5();

    System.out.println("\n=== Child class object with parent reference ===");
    Appliance kitchenApplianceAsAppliance = new KitchenAppliance();
    kitchenApplianceAsAppliance.method1();
    kitchenApplianceAsAppliance.method2();
    kitchenApplianceAsAppliance.method3();
    kitchenApplianceAsAppliance.method4();
    kitchenApplianceAsAppliance.method5();

    System.out.println("\n=== Child class object ===");
    KitchenAppliance kitchenAppliance = new KitchenAppliance();
    kitchenAppliance.method1();
    kitchenAppliance.method2();
    kitchenAppliance.method3();
    kitchenAppliance.method4();
    kitchenAppliance.method5();
    kitchenAppliance.specialFeature(); // Child-specific method
    if (Appliance instanceof KitchenAppliance) {
        KitchenAppliance ka = (KitchenAppliance) appliance1;
        ka.specialFeature();
    }

}
}
