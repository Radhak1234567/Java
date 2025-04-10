package com.xworkz.radha.internal;

public class Pen {
 private    int id;
   private String name;
   private double capacity;

    public Pen(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Pen{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 1225949;
    }

}

