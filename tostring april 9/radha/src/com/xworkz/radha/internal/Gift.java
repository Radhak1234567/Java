package com.xworkz.radha.internal;

public class Gift {
    private String material;
    private String name;
    private double capacity;

    public Gift(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gift{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 9679;
    }
}
