package com.xworkz.radha.internal;

public class Moon {
  private   int id;
   private String name;
  private   double length;

    public Moon(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Moon{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 1967539;
    }
}
