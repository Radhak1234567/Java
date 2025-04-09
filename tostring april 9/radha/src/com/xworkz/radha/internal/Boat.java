package com.xworkz.radha.internal;

public class Boat {
    int id;
    String name;
    double capacity;

    public Boat(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Boat{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
}
