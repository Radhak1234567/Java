package com.xworkz.radha.internal;

public class Rocket {
    private int id;
  private   String name;
   private double speed;

    public Rocket(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Rocket{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }
    @Override
    public int hashCode() {
        return 689232459;
    }
}


