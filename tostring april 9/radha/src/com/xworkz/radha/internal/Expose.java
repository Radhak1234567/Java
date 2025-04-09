package com.xworkz.radha.internal;

public class Expose {
    int id;
    String title;
    double price;

    public Expose(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", price=" + price + '}';
    }
}
