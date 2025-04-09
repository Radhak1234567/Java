package com.xworkz.radha.internal;

public class Spaceship {
    int id;
    String name;
    double speed;

    public Spaceship(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Spaceship{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }

}
