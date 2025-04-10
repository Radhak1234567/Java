package com.xworkz.radha.internal;

public class GolfBall {
   private String material;
  private   String name;
   private double capacity;

    public GolfBall(String material, String name, double capacity) {
        this. material =material;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "GolfBall{" + "id=" + material + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 578799;
    }
}
