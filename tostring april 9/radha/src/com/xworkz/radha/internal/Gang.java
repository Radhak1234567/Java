package com.xworkz.radha.internal;

public class Gang {
    private String material;
    private String name;
    private double capacity;

    public Gang(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gang{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 9998786;
    }
}
