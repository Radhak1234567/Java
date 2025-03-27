package com.xworkz.reference;

public class ExperienceDetail {

        String company;
        String[] education;

        String positionHeld;
        int yearsWorked;
        String location;
        boolean WorkExperience;

        ExperienceDetail(String company, String[] education) {
            this.company = company;
            this.education = education;
            this.positionHeld = "Software Engineer";
            this.yearsWorked = 5;
            this.location = "India";
            this.WorkExperience = true;

        }

        void display() {
            System.out.println("  Company: " + company + " Position: " + positionHeld + "  Years Worked: " + yearsWorked +
                    "  Location: " + location + "  Remote Work: " + (WorkExperience ? "Yes" : "No"));
            System.out.print("  - Education: ");
            for (String edu : education) {
                System.out.print(edu + ", ");
            }
            System.out.println();
        }
    }


