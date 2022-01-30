package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Skoda> cars = new ArrayList<>();

        cars.add(new Skoda(0, 30, 10));
        cars.add(new Skoda(0, 50, 25));
        cars.add(new Skoda(0, 100, 45));

        cars.remove(2);
        cars.remove(new Skoda(0, 30, 10));

        System.out.println(cars.size());
        for (Skoda skoda : cars) {
            System.out.println(skoda + "information: " + skoda.getSpeed());
        }
    }
}
