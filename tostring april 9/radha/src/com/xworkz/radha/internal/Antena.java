package com.xworkz.radha.internal;

public class Antena {
 private String material;
   private String name;
  private   double capacity;

    public Antena(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Antena {" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 9;
    }
}
