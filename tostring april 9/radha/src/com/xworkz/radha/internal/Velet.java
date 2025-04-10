package com.xworkz.radha.internal;

public class Velet {
  private   int id;
   private String name;
   private double length;

    public Velet(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Velet {" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 65409;
    }
}
