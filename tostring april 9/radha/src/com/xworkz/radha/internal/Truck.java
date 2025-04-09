package com.xworkz.radha.internal;

public class Truck {
    int id;
    String name;
    double loadCapacity;

    public Truck(int id, String name, double loadCapacity) {
        this.id = id;
        this.name = name;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + "id=" + id + ", name='" + name + '\'' + ", loadCapacity=" + loadCapacity + '}';
    }
}
