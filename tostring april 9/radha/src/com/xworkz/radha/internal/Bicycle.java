package com.xworkz.radha.internal;

public class Bicycle {
    private int id;
   private String name;
   private double speed;

    public Bicycle(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }  @Override
    public int hashCode() {
        return 32;
    }

}
