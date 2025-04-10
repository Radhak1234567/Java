package com.xworkz.radha.internal;

public class Hockey {
   private String material;
  private   String name;
   private double capacity;

    public Hockey(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hockey {" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 3499;
    }
}
