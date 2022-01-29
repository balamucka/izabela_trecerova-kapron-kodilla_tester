package com.kodilla.collection.interfaces.kodilla.inheritance.homework;

public class Linux extends Android{
    public Linux(int year) {
        super(year);
    }

    public void openFolder() {
        System.out.println("Opening folder...");
    }

    public void closeFolder() {
        System.out.println("Closing folder...");
    }

    @Override
    public void turnOnSystem() {
        System.out.println("System was turned on at 9AM.");
    }
}
