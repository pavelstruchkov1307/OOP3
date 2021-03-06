package com.company;

public class Battle {
    public void start() {

        Stregobor stregobor = new Stregobor(" Стрегобор", "лучник");
        Hottabych hottabych = new Hottabych(" Хоттабыч", "маг");

        System.out.println(hottabych.getSpecialization() + hottabych.getName() + hottabych.releasesAFireball());
        System.out.println(stregobor.getSpecialization() + stregobor.getName() + stregobor.dodged());
        System.out.println(stregobor.getSpecialization() + stregobor.getName() + stregobor.bowShot());
        System.out.println(hottabych.getSpecialization() + hottabych.getName() + hottabych.perished());
        System.out.println(stregobor.getSpecialization() + stregobor.getName() + stregobor.run());


    }
}
