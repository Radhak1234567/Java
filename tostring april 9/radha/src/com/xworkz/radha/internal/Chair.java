package com.xworkz.radha.internal;

public class Chair {
    private String material;
    private String name;
    private double capacity;

    public Chair(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Chair{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 43;
    }
}
