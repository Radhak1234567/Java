package com.xworkz.reference;

public class Transport {
        String type;

        int capacity;
        boolean electric;
        String manufacturer;
        int yearOfManufacture;

        Transport(String type) {
            this.type = type;
            this.capacity = 4;
            this.electric = true;
            this.manufacturer = "Nelson mandela";
            this.yearOfManufacture = 2023;
        }

        void display() {
            System.out.println("  - Transport: " + type + "  Capacity: " + capacity + " Electric: " + (electric ? "Yes" : "No") +
                    "  Manufacturer: " + manufacturer + "  Year: " + yearOfManufacture);
        }
    }


