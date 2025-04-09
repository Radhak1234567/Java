package com.xworkz.radha.internal;

public class Abacus {
    String material;
    String name;
    double capacity;

    public Abacus(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Abacus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
