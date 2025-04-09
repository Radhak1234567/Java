package com.xworkz.radha.internal;

public class Laptop {
    int id;
    String brand;
    double price;

    public Laptop(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
