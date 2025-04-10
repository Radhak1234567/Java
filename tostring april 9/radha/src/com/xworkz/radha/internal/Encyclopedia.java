package com.xworkz.radha.internal;

public class Encyclopedia {
    private int id;
    private String title;
    private double price;

    public Encyclopedia(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Encyclopedia{" + "id=" + id + ", title='" + title + '\'' + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        return 76;
    }
}
