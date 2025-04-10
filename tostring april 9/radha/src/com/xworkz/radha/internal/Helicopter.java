package com.xworkz.radha.internal;

public class Helicopter {
  private   int id;
  private   String name;
    private double altitude;

    public Helicopter(int id, String name, double altitude) {
        this.id = id;
        this.name = name;
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "id=" + id + ", name='" + name + '\'' + ", altitude=" + altitude + '}';
    }
    @Override
    public int hashCode() {
        return 123499;
    }
}
