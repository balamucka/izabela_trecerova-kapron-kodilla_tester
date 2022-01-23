package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities=responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
    public void displayResponsibilities() {
        System.out.println("Obowiązki w pracy to " + responsibilities + ".");
    }
}


