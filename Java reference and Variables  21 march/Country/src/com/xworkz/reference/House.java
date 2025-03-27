package com.xworkz.reference;

public class House {
    Room[] rooms;
    HouseKeep[] houseKeeps;


    String houseName;
    int floors;
    boolean hasSwimmingPool;
    String owner;

    House() {
        this.houseName = "My Villa";
        this.floors = 3;
        this.hasSwimmingPool = true;
        this.owner = "Radha";

        this.rooms = new Room[]{new Room("Luxury "), new Room("Guest Room")};
        this.houseKeeps = new HouseKeep[]{new HouseKeep("Car Service"), new HouseKeep("Laundry Service")};
    }

    void display() {
        System.out.println("House Details:");
        System.out.println("Name: " + houseName + " Floors: " + floors + "  Swimming Pool: " + (hasSwimmingPool? "Yes" : "No") +
                "  Owner: " + owner);
        System.out.println("Rooms:");
        for (Room room : rooms) {
            room.display();
        }
        System.out.println("HouseKeeping Services:");
        for (HouseKeep hk : houseKeeps) {
            hk.display();
        }
        System.out.println("====================================");
    }
}


