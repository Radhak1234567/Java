package com.xworkz.radha.internal;

public class Bicycle {int id;
    String name;
    double speed;

    public Bicycle(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }

}
