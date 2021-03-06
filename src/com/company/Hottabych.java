package com.company;

public class Hottabych extends Human implements Conjuring {
    Hottabych(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public String run() {
        return " создает туман и исчезает в нем";
    }

    @Override
    public String releasesAFireball() {
        return " выпускает огенный шар";
    }

    @Override
    public String createShield() {
        return " создает щит вокруг себя";
    }
}
