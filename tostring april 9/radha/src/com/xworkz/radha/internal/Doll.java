package com.xworkz.radha.internal;

public class Doll {
    int id;
    String name;
    String material;

    public Doll(int id, String name, String material) {
        this.id = id;
        this.name = name;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Doll{" + "id=" + id + ", name='" + name + '\'' + ", material='" + material + '\'' + '}';
    }
}
