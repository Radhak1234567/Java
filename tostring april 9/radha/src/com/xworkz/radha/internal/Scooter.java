package com.xworkz.radha.internal;

public class Scooter {int id;
    String name;
    double speed;

    public Scooter(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Scooter{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }

}
