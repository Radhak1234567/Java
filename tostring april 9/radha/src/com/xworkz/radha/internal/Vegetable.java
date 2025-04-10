package com.xworkz.radha.internal;

public class Vegetable {
 private    int id;
  private   String name;
  private   double length;

    public Vegetable(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Vegetable {" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 977;
    }
}
