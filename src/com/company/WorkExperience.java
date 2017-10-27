package com.company;

import java.util.ArrayList;

public class WorkExperience {

    private String YearsOfExperience;
    private String WorkTitle;
    private String Duties;
    public ArrayList<WorkExperience> myWorkExperience;
    public ArrayList<Skills> workRatings;
    public ArrayList<Skills> description;

    public ArrayList<WorkExperience> getMyWorkExperience() {
        return myWorkExperience;
    }

    public void setMyExperience(ArrayList<WorkExperience> myWorkExperience) {
        this.myWorkExperience = myWorkExperience;
    }



    public ArrayList<Skills> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<Skills> description) {
        this.description = description;
    }

    public ArrayList<Skills> getWorkRatings() {
        return workRatings;
    }

    public void setWorkRatings(ArrayList<Skills> workRatings) {
        this.workRatings = workRatings;
    }

    public WorkExperience(){
        workRatings = new ArrayList<Skills>();
    }


    public String getDuties() {
        return Duties;
    }

    public void setDuties(String duties) {
        Duties = duties;
    }



    public String getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public String getWorkTitle() {
        return WorkTitle;
    }

    public void setWorkTitle(String workTitle) {
        WorkTitle = workTitle;
    }

    public void addSkills(Skills mySkills)
    {
        workRatings.add(mySkills);
        description.add(mySkills);
    }
}
