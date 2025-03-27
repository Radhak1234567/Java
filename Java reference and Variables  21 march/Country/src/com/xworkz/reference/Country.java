package com.xworkz.reference;

public class Country {
    String name;
    String continent;
    String Language;
    String States;
    PrimeMinister primeMinister;
    Security security;
    House house;

    Country() {
        this.name = "India";
        this.continent = "asia";
        this.Language = "English";
        this.primeMinister = new PrimeMinister("Narendra modi");
        this.security = new Security();
        this.house = new House();
        this.States="Delhi";


    } void display() {

        System.out.println("In Country : ");
        System.out.println("Name : " + this.name);
        System.out.println("Continent : " + this.continent);
        System.out.println("Language : " + this.Language);
        System.out.println("States : " + this.States);

        primeMinister.display();
        security.display();
        house.display();
        System.out.println("====================================");

    }}