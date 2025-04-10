package com.xworkz.radha.internal;

public class Hairnet {
    private int id;
  private   String name;
  private   double length;

    public Hairnet(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return " Hairnet{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 2345699;
    }
}
