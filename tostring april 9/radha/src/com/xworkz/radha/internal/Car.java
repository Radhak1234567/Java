package com.xworkz.radha.internal;

public class Car {
    int id;
    String name;
    double capacity;

    public Car(int id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", name='" + name + '\'' + ", capacity=" + capacity + '}';
    }


}


