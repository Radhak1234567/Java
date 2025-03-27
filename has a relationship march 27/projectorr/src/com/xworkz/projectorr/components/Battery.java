package com.xworkz.projectorr.components;

public class Battery {
    private String brand;
    private int voltage;

    public Battery(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void display() {
        System.out.println("Battery Brand: " + brand + ", Voltage: " + voltage + "V");
    }
}
