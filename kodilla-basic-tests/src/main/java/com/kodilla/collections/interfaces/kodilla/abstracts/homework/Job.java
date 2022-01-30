package com.kodilla.collections.interfaces.kodilla.abstracts.homework;

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
    @Override
    public String toString() {
        return "Obowiązki w pracy to " + responsibilities + ".";
    }
}


