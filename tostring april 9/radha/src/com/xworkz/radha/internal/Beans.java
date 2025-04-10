package com.xworkz.radha.internal;

public class Beans {
    private String material;
    private String name;
    private double capacity;

    public Beans(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Beans{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 1111;
    }
}
