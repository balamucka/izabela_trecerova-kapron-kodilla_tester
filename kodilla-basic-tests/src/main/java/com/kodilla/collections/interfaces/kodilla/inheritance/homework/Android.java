package com.kodilla.collections.interfaces.kodilla.inheritance.homework;

public class Android extends OperatingSystem{
    public Android(int year) {
        super(year);
    }

    public void openAplication() {
        System.out.println("Opening aplication...");
    }

    public void closeAplication() {
        System.out.println("Closing aplication...");
    }

    @Override
    public void turnOnSystem() {
        System.out.println("System was turned on at 8AM.");
    }
}
