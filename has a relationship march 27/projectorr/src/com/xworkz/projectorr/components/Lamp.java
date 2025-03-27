package com.xworkz.projectorr.components;

public class Lamp { private String brand;
    private Warranty warranty;

    public Lamp(String brand, Warranty warranty) {
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("Lamp Brand: " + brand);
        warranty.display();
    }
}
