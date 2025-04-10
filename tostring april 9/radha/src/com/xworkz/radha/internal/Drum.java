package com.xworkz.radha.internal;

public class Drum {
    private String material;
    private String name;
    private double capacity;

    public Drum(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Drum{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 87;
    }
}
