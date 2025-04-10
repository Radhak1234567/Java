package com.xworkz.radha.internal;

public class Glide {
    private String material;
    private String name;
    private double capacity;

    public Glide(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Glide{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 9345679;
    }
}
