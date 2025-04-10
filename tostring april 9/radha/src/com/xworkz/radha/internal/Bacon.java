package com.xworkz.radha.internal;

public class Bacon {
  private   String material;
  private   String name;
   private double capacity;

    public Bacon(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bacon{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 66;
    }
}
