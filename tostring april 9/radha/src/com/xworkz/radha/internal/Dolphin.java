package com.xworkz.radha.internal;

public class Dolphin {
 private    String material;
  private   String name;
  private   double capacity;

    public Dolphin(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dolphin{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 32;
    }
}
