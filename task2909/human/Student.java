package com.javarush.task.task17.task2909.human;

import java.util.Date;

public class Student extends UniversityPerson {

    private double averageGrade;
    private int course;
    private Date beginningOfSession;
    private Date endOfSession;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    @Override
    public String getPosition() {
        return "Студент";
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }


    public int getCourse() {
        return course;
    }



    public void incAverageGrade(double delta) {
        averageGrade += delta;
    }

  



    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }


    public double getAverageGrade() {
        return averageGrade;
    }
}