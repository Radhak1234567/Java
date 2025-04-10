package com.xworkz.radha.internal;

public class Diamond {
  private   String material;
 private    String name;
   private double capacity;

    public Diamond(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Diamond{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 76;
    }
}
