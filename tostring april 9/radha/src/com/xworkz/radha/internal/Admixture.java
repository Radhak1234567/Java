package com.xworkz.radha.internal;

public class Admixture {
  private   String material;
    private String name;
    private double capacity;

    public Admixture(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
