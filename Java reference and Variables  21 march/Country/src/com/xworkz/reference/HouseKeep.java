package com.xworkz.reference;

public class HouseKeep {
    Transport transport;


    String serviceType;
    int staffCount;
    boolean available24x7;
    String supervisor;

    HouseKeep(String transportType) {
        this.serviceType = " Cleaning";
        this.staffCount = 10;
        this.available24x7 = true;
        this.supervisor = "Rad";

        this.transport = new Transport(transportType);
    }

    void display() {
        System.out.println("Housekeeping Service: " + serviceType + " Staff Count: " + staffCount +
                "  Available 24x7: " + (available24x7 ? "Yes" : "No") + "  Supervisor: " + supervisor);
        transport.display();
        System.out.println("===========================================");
    }
}


