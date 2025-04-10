package com.xworkz.radha.internal;

public class Paint {
 private    String material;
  private   String name;
  private   double capacity;

    public Paint(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return " Paint{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 234399;
    }
}
