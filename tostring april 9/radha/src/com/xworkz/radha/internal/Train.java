package com.xworkz.radha.internal;

public class Train {
    private int id;
  private   String name;
    private double speed;

    public Train(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Train{" + "id=" + id + ", name='" + name + '\'' + ", speed=" + speed + '}';
    }

 @Override
public int hashCode() {
    return 9086469;
}}
