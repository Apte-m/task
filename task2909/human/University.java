package com.javarush.task.task17.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University extends UniversityPerson {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {

        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade)
                return student;
        }
        return null;

    }

    public void expel(Student student) {
        students.remove(student);
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        return students.stream().max(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
       return students.stream().min(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }
}