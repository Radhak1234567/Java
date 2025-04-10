package com.xworkz.radha.internal;

public class Expose {
    private int id;
    private String title;
    private double price;

    public Expose(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Expose{" + "id=" + id + ", title='" + title + '\'' + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        return 888;
    }
}
