package com.xworkz.radha.internal;

public class Dirt {
 private    String material;
 private    String name;
  private   double capacity;

    public Dirt(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dirt{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 87;
    }
}
