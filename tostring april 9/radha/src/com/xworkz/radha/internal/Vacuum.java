package com.xworkz.radha.internal;

public class Vacuum {
 private    int id;
   private String name;
  private   double length;

    public Vacuum(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Vacuum{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 239456779;
    }
}
