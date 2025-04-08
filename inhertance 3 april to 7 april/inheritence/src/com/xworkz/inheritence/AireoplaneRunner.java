package com.xworkz.inheritence;

public class AireoplaneRunner {   public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Airoplane airoplane = new Airoplane();
    airoplane.fly();
    airoplane.roam();
    airoplane.travel();
    airoplane.world();
    airoplane.nature();

    System.out.println("\n=== Child class object with parent reference ===");
    Airoplane jetAsAiroplane = new SubClassAiroplane();
    jetAsAiroplane.fly();
    jetAsAiroplane.roam();
    jetAsAiroplane.travel();
    jetAsAiroplane.world();
    jetAsAiroplane.nature();

    System.out.println("\n=== Child class object ===");
    SubClassAiroplane jetPlane = new SubClassAiroplane();
    jetPlane.fly();
    jetPlane.roam();
    jetPlane.travel();
    jetPlane.world();
    jetPlane.nature();
    jetPlane.supersonicSpeed(); // Child-specific method
    if (jetAsAiroplane instanceof SubClassAiroplane) {
        SubClassAiroplane subClassAiroplane = (SubClassAiroplane) jetAsAiroplane;
        jetPlane.supersonicSpeed();
    }
}
}
