package com.xworkz.radha.internal;

public class Doll {
  private   int id;
  private   String name;
  private   String material;

    public Doll(int id, String name, String material) {
        this.id = id;
        this.name = name;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Doll{" + "id=" + id + ", name='" + name + '\'' + ", material='" + material + '\'' + '}';
    }
    @Override
    public int hashCode() {
        return 45;
    }
}
