package com.javarush.task.task29.task2909.human;

public class Worker {
    private Soldier human;
    private double salary;
    public String company;

    public Worker(String name, int age) {
        human = new Soldier(name,age);
    }

    public void live() {
        human.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSlr(double salary) {
        this.salary = salary;
    }
}