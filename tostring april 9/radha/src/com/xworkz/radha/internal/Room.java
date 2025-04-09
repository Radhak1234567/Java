package com.xworkz.radha.internal;

public class Room {
    int id;
    String name;
    double capacity;

    public Room(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }



}
