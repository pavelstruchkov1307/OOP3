package com.company;

public abstract class Human {

    private String name;
    private String specialization;

    Human(String name, String specialization){
        this.name=name;
        this.specialization=specialization;
    }
    public String getName() {
        return this.name;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public abstract String run();

    public String perished() {
        return " погиб";
    }

}


