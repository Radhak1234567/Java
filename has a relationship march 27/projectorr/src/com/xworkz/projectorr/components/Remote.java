package com.xworkz.projectorr.components;

public class Remote {  private String model;
    private Battery battery;

    public Remote(String model, Battery battery) {
        this.model = model;
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void display() {
        System.out.println("Remote Model: " + model);
        battery.display();
    }
}
