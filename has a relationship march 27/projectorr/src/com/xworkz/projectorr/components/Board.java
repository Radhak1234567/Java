package com.xworkz.projectorr.components;

public class Board { private String manufacturer;
    private String capacitor;

    public Board(String manufacturer, String capacitor) {
        this.manufacturer = manufacturer;
        this.capacitor = capacitor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCapacitor() {
        return capacitor;
    }

    public void setCapacitor(String capacitor) {
        this.capacitor = capacitor;
    }

    public void display() {
        System.out.println("Board Manufacturer: " + manufacturer + ", Capacitor: " + capacitor);
    }
}
