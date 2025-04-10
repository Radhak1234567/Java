package com.xworkz.radha.internal;

public class Hammer {
  private   int id;
    private String name;
  private   double length;

    public Hammer(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hammer{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 45699;
    }

}
