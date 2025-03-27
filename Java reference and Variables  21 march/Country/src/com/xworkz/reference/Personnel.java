package com.xworkz.reference;

public class Personnel  {
    Skill skill;

    String name;
    int yearsOfExperience;
    String rank;
    boolean certified;

    Personnel(String skillName) {
        this.name = "John Doe";
        this.yearsOfExperience = 7;
        this.rank = "Senior Officer";
        this.certified = true;

        this.skill = new Skill(skillName);
    }

    void display() {
        System.out.println("Personnel Details:");
        System.out.println("Name: " + name + "  Experience: " + yearsOfExperience + " years  Rank: " + rank +
                "  Certified: " + (certified ? "Yes" : "No"));
        System.out.print("Personnel with Skill: ");
        skill.display();
    }
}


