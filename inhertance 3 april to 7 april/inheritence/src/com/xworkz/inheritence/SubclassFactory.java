package com.xworkz.inheritence;

public class SubclassFactory extends  Ballon {
     public SubclassFactory() {
        System.out.println("No-arg constructor of SubclassFactory");
    }

    @Override
    public void getEmployee() {
        System.out.println("Running getEmployee in SubclassFactory");
    }

    @Override
    public void setEquipments() {
        System.out.println("Running setEquipments in SubclassFactory");
    }

    @Override
    public void manufacture() {
        System.out.println("Running manufacture in SubclassFactory");
    }

    @Override
    public void selectItem() {
        System.out.println("Running selectItem in SubclassFactory");
    }

    @Override
    public void produceProduct() {
        System.out.println("Running produceProduct in SubclassFactory");
    }

    public void fillAir() {
        System.out.println("Running fillAir in SubclassFactory");
    }
}

