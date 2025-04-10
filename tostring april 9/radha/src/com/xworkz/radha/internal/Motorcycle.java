package com.xworkz.radha.internal;

public class Motorcycle {
   private int id;
  private   String brand;
   private double engineCapacity;

    public Motorcycle(int id, String brand, double engineCapacity) {
        this.id = id;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "id=" + id + ", brand='" + brand + '\'' + ", engineCapacity=" + engineCapacity + '}';
    }  @Override
    public int hashCode() {
        return 23499;
    }
}
