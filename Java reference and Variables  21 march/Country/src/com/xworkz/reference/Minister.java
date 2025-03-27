package com.xworkz.reference;

public class Minister  {
    String name;
    PersonalAssistant assistant;


    String department;
    int years;
    String education;
    String previousRole;

    Minister(String name, String assistantName) {
        this.name = name;
        this.department = "Finance";
        this.years = 3;
        this.education = "Master's in Economics";
        this.previousRole = "Chief Financial Advisor";

        this.assistant = new PersonalAssistant(assistantName);
    }

    void display() {
        System.out.println("Minister Details:");
        System.out.println("Name: " + name + " Department: " + department + " Years in Office: " + years +
                " Education: " + education + " Previous Role: " + previousRole);
        assistant.display();
    }
}


