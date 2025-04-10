package com.xworkz.radha.internal;

public class Compass {
  private   String material;
  private   String name;
   private double capacity;

    public Compass(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Compass{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 5;
    }
}
