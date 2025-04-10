package com.xworkz.radha.internal;

public class Village {
   private int id;
   private String name;
   private double length;

    public Village(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Village{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
    @Override
    public int hashCode() {
        return 9;
    }
}
