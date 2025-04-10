package com.xworkz.radha.internal;

public class Laptop {
   private int id;
   private String brand;
  private   double price;

    public Laptop(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", brand='" + brand + '\'' + ", price=" + price + '}';
    }
    @Override
    public int hashCode() {
        return 57899;
    }
}
