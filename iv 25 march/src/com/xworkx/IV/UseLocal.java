package com.xworkx.IV;
import java.time.LocalDate;

public class UseLocal {

    public void createJail() {
        Jail jail = new Jail("Central", "India", "John", 300);
        System.out.println("Jail Name: " + jail.getName());
    }

    public void createSatellite() {
        Satellite satellite = new Satellite(SatelliteType.COMMUNICATION, 5000000, 2000, 3000);
        System.out.println("Satellite Type: " + satellite.getType());
    }

    public void createIdCard() {
        String[] colors = {"Red", "Blue", "Green"};
        IdCard idCard = new IdCard("Plastic", colors, 0.2, "Designer A");
        System.out.println("ID Card Material: " + idCard.getMaterial());
    }

    public void createAlien() {
        Alien alien = new Alien("Radha", LocalDate.of(2025, 3, 25), "Green with large eyes");
        System.out.println("Alien Seen By: " + alien.getSeenBy());
    }

    public void createCamera() {
        Camera camera = new Camera("Canon", 1500, CameraType.DSLR, "WiFi");
        System.out.println("Camera Brand: " + camera.getBrand());
    }

    // Method using class as parameter
    public void processJail(Jail jail) {
        System.out.println("Processing Jail: " + jail.getName());
    }

    public void createArrayOfAliens() {
        Alien[] aliens = {
                new Alien("John", LocalDate.of(2025, 3, 25), "Green skin, 3 eyes"),
                new Alien("Sarah", LocalDate.of(2025, 3, 26), "Large and gray, 4 arms")
        };

        System.out.println("First Alien Seen By: " + aliens[0].getSeenBy());
        System.out.println("Second Alien Seen By: " + aliens[1].getSeenBy());
    }
}
