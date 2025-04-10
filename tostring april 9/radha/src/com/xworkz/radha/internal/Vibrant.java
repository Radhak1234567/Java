package com.xworkz.radha.internal;

public class Vibrant {
  private   int id;
  private   String name;
   private double length;

    public Vibrant(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Vibrant {" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 6;
    }
}
