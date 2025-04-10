package com.xworkz.radha.internal;

public class Gym {
  private   String material;
  private   String name;
   private double capacity;

    public Gym(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Gym{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 134599;
    }
}
