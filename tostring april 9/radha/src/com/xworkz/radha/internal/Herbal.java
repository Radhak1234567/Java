package com.xworkz.radha.internal;

public class Herbal {
   private int id;
   private String name;
 private    double length;

    public Herbal(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Herbal{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 99;
    }
}
