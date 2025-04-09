package com.xworkz.radha.internal;

public class Violin {
    int id;
    String name;
    double length;

    public Violin(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Yacht{" + "id=" + id + ", name='" + name + '\'' + ", length=" + length + '}';
    }
}
