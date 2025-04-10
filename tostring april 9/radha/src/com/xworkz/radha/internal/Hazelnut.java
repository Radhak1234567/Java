package com.xworkz.radha.internal;

public class Hazelnut {
  private   int id;
  private   String name;
   private double length;

    public Hazelnut(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hazelnut{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 234599;
    }
}
