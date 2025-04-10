package com.xworkz.radha.internal;

public class Chalk {
    private String material;
    private String name;
    private double capacity;

    public Chalk(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Chalk{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 45;
    }
}
