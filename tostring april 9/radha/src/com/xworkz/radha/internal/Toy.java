package com.xworkz.radha.internal;

public class Toy {
  private   int id;
   private String name;
   private double capacity;

    public Toy(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Toy{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 4567;
    }


}


