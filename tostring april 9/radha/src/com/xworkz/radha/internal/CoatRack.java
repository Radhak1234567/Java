package com.xworkz.radha.internal;

public class CoatRack {
    String material;
    String name;
    double capacity;

    public CoatRack(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
