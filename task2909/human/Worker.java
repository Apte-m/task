package com.javarush.task.task17.task2909.human;

public class Worker extends Human {
    private Soldier soldier;
    private double salary;
    public String company;

    public Worker(String name, int age) {
        super(name, age);

    }

    public void live() {
        soldier.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}