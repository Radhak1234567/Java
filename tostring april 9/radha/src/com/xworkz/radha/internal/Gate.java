package com.xworkz.radha.internal;

public class Gate {
    private String material;
    private String name;
    private double capacity;

    public Gate(String material, String name, double capacity) {
        this.material = material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gate{" + "material='" + material + '\'' + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 1233499;
    }
}
