package com.xworkz.radha.internal;

public class Helicopter {
    int id;
    String name;
    double altitude;

    public Helicopter(int id, String name, double altitude) {
        this.id = id;
        this.name = name;
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "id=" + id + ", name='" + name + '\'' + ", altitude=" + altitude + '}';
    }
}
