package com.xworkz.radha.internal;

public class Barley {
    private String material;
    private String name;
    private double capacity;

    public Barley(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Barley{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 106;
    }
}
