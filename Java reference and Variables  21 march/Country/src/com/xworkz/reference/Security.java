package com.xworkz.reference;

public class Security  {
    Personnel[] personnel;


    String security;
    int totalGuards;
    String headquartersLocation;
    boolean armedForces;

    Security() {
        this.security = "Security";
        this.totalGuards = 150;
        this.headquartersLocation = "Banglore";
        this.armedForces = true;

        this.personnel = new Personnel[]{
                new Personnel("Expert Security")
        };
    }

    void display() {
        System.out.println("Security Details:");
        System.out.println("Agency: " + security+ "  Total Guards: " + totalGuards +
                "  HQ: " + headquartersLocation + "  Armed Forces: " + (armedForces ? "Yes" : "No"));
        System.out.println("========================================");

        for (Personnel person : personnel) {
            person.display();
        }
    }
}


