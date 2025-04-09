package com.xworkz.radha.internal;

public class Rocket { int id;
    String name;
    double speed;

    public Rocket(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Rocket{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }
}

