package com.xworkz.radha.internal;

import java.util.Objects;

public class Abacus {
    private String material;
     private String name;
    private  double capacity;

    public Abacus(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Abacus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 99;
    }
}
