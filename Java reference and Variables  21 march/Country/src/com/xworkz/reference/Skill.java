package com.xworkz.reference;

public class Skill  {
    Experience experience;


    String skillName;
    int proficiencyLevel;
    boolean certified;
    String acquiredFrom;

    Skill(String skillName) {
        this.skillName = skillName;
        this.proficiencyLevel = 8;
        this.certified = true;
        this.acquiredFrom = "XWORKZ Training Institute";

        this.experience = new Experience(new ExperienceDetail("TechCorp", new String[]{"B.Tech", "M.Tech"}));
    }

    void display() {
        System.out.println("Skill: " + skillName + "  Proficiency Level: " + proficiencyLevel +
                " Certified: " + (certified ? "Yes" : "No") + "  Acquired From: " + acquiredFrom);
        System.out.print("Experience in ");
        experience.display();
    }
}


