package com.xworkz.radha.internal;

public class Shoe {
    String material;
    String name;
    double capacity;

    public Shoe(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

}
