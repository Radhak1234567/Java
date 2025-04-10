package com.xworkz.radha.internal;

public class Spaceship {
 private    int id;
  private   String name;
  private   double speed;

    public Spaceship(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Spaceship{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }
    @Override
    public int hashCode() {
        return 92459;
    }
}
