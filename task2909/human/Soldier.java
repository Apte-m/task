package com.javarush.task.task17.task2909.human;

public class Soldier extends Human implements Alive {
    private boolean isSoldier;

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void fight() {
    }

    public void live() {
        fight();
    }


}
