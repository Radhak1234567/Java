package com.xworkz.radha.internal;

public class Bus {
  private   int id;
   private String name;
  private   double capacity;

    public Bus(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
    @Override
    public int hashCode() {
        return 87;
    }


}
