
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;

        String answer = "yes ";
         String eduanswer = " ";
         String skillans = " ";
        Person newPerson = new Person();
        Education myEducation;
        WorkExperience myWorkExperience;
        Skills mySkills ;
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Education> educationList = new ArrayList<Education>();
        ArrayList<WorkExperience> workExperiences = new ArrayList<>();
        ArrayList<Skills> skill = new ArrayList<>();

        System.out.println("Enter the name of a person:");
        newPerson.setName(keyboard.nextLine());
        System.out.println("Enter email:");
        newPerson.setEmail(keyboard.nextLine());

        System.out.println(" " + newPerson.getName() + " \n" + newPerson.getEmail());

        do {
            do {


                myEducation = new Education();
                System.out.println("enter Education:");
                //myEducation.setDegree(keyboard.nextLine());
                eduanswer = keyboard.nextLine();
                if (eduanswer.isEmpty()) {
                    System.out.println(" its empty, add education");
                } else {
                    System.out.println("enter information");
                }
            }while(eduanswer.isEmpty());

                System.out.println("enter college name:");
                myEducation.setCollegeName(keyboard.nextLine());

                System.out.println(" enter year of graduation:");
                myEducation.setYearOfGraduation(keyboard.nextLine());

                educationList.add(myEducation);
                System.out.println(" do you want to enter more education details:(yes/no)");
                answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("quit from Education:");
                }
                count++;
            } while ((count <= 10) && (answer.equalsIgnoreCase("yes")) );

            //educationList.add(myEducation);

            do {
                myWorkExperience = new WorkExperience();
                System.out.println("Work Experience:");
                System.out.println(" work Title:");
                myWorkExperience.setWorkTitle(keyboard.nextLine());
                System.out.println("years of Experience(dd/MMM/YYYY):");
                myWorkExperience.setYearsOfExperience(keyboard.nextLine());
                System.out.println(" duties:");
                myWorkExperience.setDuties(keyboard.nextLine());
                workExperiences.add(myWorkExperience);
                System.out.println("do you want to enter more experience:(yes/no):");
                answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("quit from experience:");
                }
                count++;
            }while (count <= 10 && (answer.equalsIgnoreCase("yes")));
            //workExperiences.add(myWorkExperience);

                do {

                        mySkills = new Skills();
                        System.out.println("SKILLS:");

                        System.out.println(" enter Ratings:");
                        mySkills.setWorkRatings(keyboard.nextLine());

                     System.out.println(" enter description:");
                    mySkills.setDescription(keyboard.nextLine());
                    skill.add(mySkills);
                    System.out.println("do you want to enter more Skills:(yes/no):");
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("no")) {
                        System.out.println("quit from skills:");
                    }
                    count++;

                } while (count <= 20 && (answer.equalsIgnoreCase("yes")));


        for (Education eachEducation : educationList) {
            System.out.println("EDUCATION");
            System.out.println("COLLEGE NAME:" + eachEducation.getCollegeName() + "\n" + eachEducation.getDegree() +
                    "\n" + eachEducation.getYearOfGraduation());
//            System.out.println("................");


        }
            for (WorkExperience eachExperience : workExperiences) {
                System.out.println("WORK EXPERIENCE");
                System.out.println(" WORK TITLE:" + eachExperience.getWorkTitle() + "\n"
                        + eachExperience.getYearsOfExperience());
                System.out.println("DUTY" + "\n" + eachExperience.getDuties());
//                System.out.println("..................");


            }
                for (Skills eachSkills : skill) {
                    System.out.println("....................");
                    System.out.println("WORK RATINGS:" + "\n" +eachSkills.getWorkRatings());
                    System.out.println("WORK DESCRIPTION:" +eachSkills.getDescription());

                }




     }

}

