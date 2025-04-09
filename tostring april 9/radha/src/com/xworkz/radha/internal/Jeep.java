package com.xworkz.radha.internal;

public class Jeep {
    int id;
    String name;
    double torque;

    public Jeep(int id, String name, double torque) {
        this.id = id;
        this.name = name;
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Jeep{" + "id=" + id + ", name='" + name + '\'' + ", torque=" + torque + '}';
    }
}
