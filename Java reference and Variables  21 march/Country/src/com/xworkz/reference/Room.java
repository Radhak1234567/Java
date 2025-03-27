package com.xworkz.reference;

public class Room {
    String type;


    int roomNumber;
    boolean hasBalcony;
    double size;
    String view;

    Room(String type) {
        this.type = type;
        this.roomNumber = 101;
        this.hasBalcony = true;
        this.size = 3;
        this.view = "Pool View";
    }

    void display() {
        System.out.println("  Room: " + type + "  Room No: " + roomNumber + "  Balcony: " + (hasBalcony ? "Yes" : "No") +
                "  Size: " + size + " sqm  View: " + view);
    }
}


