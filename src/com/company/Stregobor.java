package com.company;

public class Stregobor extends Human implements Shooting {

    Stregobor(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public String run() {
        return " скрылся с поля боя";
    }

    @Override
    public String bowShot() {
        return " выпускает стрелу";
    }

    @Override
    public String dodged() {
        return " увернулся";
    }
}

