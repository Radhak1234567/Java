package com.xworkz.radha.internal;

public class Elephant {
    String material;
    String name;
    double capacity;

    public Elephant(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
