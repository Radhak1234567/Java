package com.xworkz.radha.internal;

public class Eagle {
    private String material;
    private String name;
    private double capacity;

    public Eagle(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Eagle{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
