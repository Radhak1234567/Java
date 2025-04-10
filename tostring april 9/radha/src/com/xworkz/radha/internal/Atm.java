package com.xworkz.radha.internal;

public class Atm {
  private   String material;
private String name;
  private   double capacity;

    public Atm(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Atm{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 111;
    }
}
