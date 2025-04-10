package com.xworkz.radha.internal;

public class Coffee {
    private String material;
    private String name;
    private double capacity;

    public Coffee(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Coffee{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 3;
    }
}
