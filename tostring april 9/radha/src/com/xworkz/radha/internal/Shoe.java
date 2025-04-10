package com.xworkz.radha.internal;

public class Shoe {
  private   String material;
   private String name;
  private   double capacity;

    public Shoe(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Shoe{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 59;
    }

}
