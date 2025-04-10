package com.xworkz.radha.internal;

public class Valid {
   private int id;
  private   String name;
  private   double length;

    public Valid(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Valid {" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 213245699;
    }
}
