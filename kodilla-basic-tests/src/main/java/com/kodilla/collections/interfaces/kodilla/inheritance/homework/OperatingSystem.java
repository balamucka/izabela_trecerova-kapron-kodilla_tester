package com.kodilla.collections.interfaces.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOnSystem() {
        System.out.println("System was turned on at 7AM.");
    }
    public void turnOffSystem() {
        System.out.println("System was turned off.");
    }

    public int getYear() {
        return year;
    }
}
