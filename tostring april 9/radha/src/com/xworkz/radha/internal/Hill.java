package com.xworkz.radha.internal;

public class Hill {
   private int id;
  private   String name;
   private double length;

    public Hill(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return " Hill{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 234599;
    }
}
