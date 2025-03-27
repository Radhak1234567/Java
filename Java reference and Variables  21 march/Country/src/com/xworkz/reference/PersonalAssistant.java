package com.xworkz.reference;

public class PersonalAssistant  {
    String name;


    int experienceYears;
    String specialization;
    String previousEmployer;
    String education;

    PersonalAssistant(String name) {
        this.name = name;
        this.experienceYears = 5;
        this.specialization = "Government Administration";
        this.previousEmployer = "Indian Council";
        this.education = "Bachelor's in Public Administration";
    }

    void display() {
        System.out.println("Personal Assistant Details:");
        System.out.println("Name: " + name + "  Experience: " + experienceYears + " years  Specialization: " + specialization +
                "  Previous Employer: " + previousEmployer + "  Education: " + education);
        System.out.println("===================================");
    }
}


