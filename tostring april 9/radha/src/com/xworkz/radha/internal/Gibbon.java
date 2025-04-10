package com.xworkz.radha.internal;

public class Gibbon {
    private String material;
    private String name;
    private double capacity;

    public Gibbon(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gibbon{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 3456;
    }
}
