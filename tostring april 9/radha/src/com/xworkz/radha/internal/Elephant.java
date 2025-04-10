package com.xworkz.radha.internal;

public class Elephant {
    private String material;
    private String name;
    private double capacity;

    public Elephant(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Elephant{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 8;
    }
}
