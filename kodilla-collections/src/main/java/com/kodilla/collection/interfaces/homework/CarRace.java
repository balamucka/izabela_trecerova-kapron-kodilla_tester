package com.kodilla.collection.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Skoda skoda = new Skoda(0, 50, 30);
        doRace(skoda);

        Toyota toyota = new Toyota(0, 70,40);
        doRace(toyota);

        Volvo volvo = new Volvo(0, 90, 50);
        doRace(volvo);
    }


    private static void doRace(Car car) {
        System.out.println("Aktualna prędkość: " + car.getSpeed());
    }

}

