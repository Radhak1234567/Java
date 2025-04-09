package com.xworkz.radha.internal;

public class Bagel {
    String material;
    String name;
    double capacity;

    public Bagel(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
