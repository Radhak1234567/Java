package com.xworkz.radha.internal;

public class Guest {
 private    String material;
  private   String name;
   private double capacity;

    public Guest(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Guest{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 23499;
    }
}
