package com.xworkz.reference;

public class PrimeMinister {
    String name;
    Minister[] ministers;

    int termYears;
    String party;
    int age;
    String country;

    PrimeMinister(String name) {
        this.name = name;
        this.termYears = 5;
        this.party = "Democratic Party";
        this.age = 55;
        this.country = "India";

        this.ministers = new Minister[]{
                new Minister("Sridevi", "Shana"),
        };
    }

    void display() {
        System.out.println("Prime Minister Details:");
        System.out.println("Name: " + name + "  Age: " + age + "  Term: " + termYears + " years  Party: " + party + "  Country: " + country);
        System.out.println("====================================");
        for (Minister minister : ministers) {
            minister.display();
        }
    }
}


