package com.kodilla.abstracts.homework;

public abstract class Job {

    private double salary;
    private String responsibilities;

    public Job(double salary, String responsibilities) {

        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    double getSalary() {
        return salary;
    }

    String getResponsibilities() {
        return responsibilities;
    }
}

