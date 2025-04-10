package com.xworkz.radha.internal;

public class Hacksaw {
   private int id;
  private   String name;
 private    double length;

    public Hacksaw(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hacksaw{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 5699;
    }
}
