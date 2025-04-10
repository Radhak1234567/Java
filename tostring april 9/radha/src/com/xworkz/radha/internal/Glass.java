package com.xworkz.radha.internal;

public class Glass {
    private String material;
    private String name;
    private double capacity;

    public Glass(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Glass{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 9567899;
    }
}
