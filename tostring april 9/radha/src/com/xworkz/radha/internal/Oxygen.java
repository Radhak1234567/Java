package com.xworkz.radha.internal;

public class Oxygen {
 private    String material;
private String name;
private double capacity;

    public Oxygen(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Oxygen{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 13243599;
    }
}
