package com.xworkz.radha.internal;

public class Building {
    int id;
    String location;
    double height;

    public Building(int id, String location, double height) {
        this.id = id;
        this.location = location;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Building{" + "id=" + id + ", location='" + location + '\'' + ", height=" + height + '}';
    }
}
