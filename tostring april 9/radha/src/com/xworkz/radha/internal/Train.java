package com.xworkz.radha.internal;

public class Train { int id;
    String name;
    double speed;

    public Train(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Train{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }

}
