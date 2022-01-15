package com.demo.engine.predicate.model;

public class student {

    private String name;
    private String roll;
    private String grade;

    public student(){
        this.name="shwetabh";
        this.roll="1002";
        this.grade="A";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
