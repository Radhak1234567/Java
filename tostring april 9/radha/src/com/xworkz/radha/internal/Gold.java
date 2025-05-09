package com.xworkz.radha.internal;

public class Gold {
    private String material;
    private String name;
    private double capacity;

    public Gold(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gold{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 2399;
    }
}
