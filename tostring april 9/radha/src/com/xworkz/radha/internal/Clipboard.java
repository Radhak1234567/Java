package com.xworkz.radha.internal;

public class Clipboard {
    private String material;
    private String name;
    private double capacity;

    public Clipboard(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Clipboard{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 99;
    }
}
