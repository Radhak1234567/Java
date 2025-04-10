package com.xworkz.radha.internal;

public class Submarine {
  private   int id;
   private String name;
  private   double depth;

    public Submarine(int id, String name, double depth) {
        this.id = id;
        this.name = name;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Submarine{" + "id=" + id + ", name='" + name + '\'' + ", depth=" + depth + '}';
    }
    @Override
    public int hashCode() {
        return 976459;
    }
}

