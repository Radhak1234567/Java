package com.xworkz.radha.internal;

public class Rice {
   private int id;
  private   String name;
  private   double length;

    public Rice(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rice {" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 9232459;
    }
}

