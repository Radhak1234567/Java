package com.xworkz.radha.internal;

public class Room {
  private   int id;
    private String name;
   private double capacity;

    public Room(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Room{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        return 2432459;
    }

}
