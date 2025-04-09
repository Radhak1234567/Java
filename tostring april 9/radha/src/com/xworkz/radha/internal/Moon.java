package com.xworkz.radha.internal;

public class Moon {
    int id;
    String name;
    double length;

    public Moon(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Yacht{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
}
