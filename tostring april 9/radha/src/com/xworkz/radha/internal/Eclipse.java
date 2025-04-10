package com.xworkz.radha.internal;

public class Eclipse {
    private String material;
    private String name;
    private double capacity;

    public Eclipse(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Eclipse{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
