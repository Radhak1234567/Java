package com.xworkz.radha.internal;

public class Hat {
  private   int id;
  private   String name;
   private double length;

    public Hat(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hat{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 93249;
    }
}
