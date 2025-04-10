package com.xworkz.radha.internal;

public class Hack {
   private int id;
  private   String name;
   private double length;

    public Hack(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hack{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 56799;
    }
}
