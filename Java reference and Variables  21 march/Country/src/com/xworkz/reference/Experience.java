package com.xworkz.reference;

public class Experience {

        ExperienceDetail experienceDetail;
        int years;
        String field;
        String role;
        boolean Experience;

        Experience(ExperienceDetail detail) {
            this.years = 10;
            this.field = "Software Engineering";
            this.role = "Java Developer";
            this.Experience = true;
            this.experienceDetail = detail;
        }

        void display() {
            System.out.println("Years: " + years + "  Field: " + field + " Role: " + role + "  Leadership: " + (Experience ? "Yes" : "No"));
            experienceDetail.display();

        }
    }


