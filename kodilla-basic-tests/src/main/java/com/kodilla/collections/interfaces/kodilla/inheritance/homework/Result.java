package com.kodilla.collections.interfaces.kodilla.inheritance.homework;

public class Result {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOnSystem();
        System.out.println(operatingSystem.getYear());

        Android android = new Android(2007);
        android.turnOnSystem();
        System.out.println(android.getYear());

        Linux linux = new Linux(1991);
        linux.turnOnSystem();
        System.out.println(linux.getYear());
    }
}
