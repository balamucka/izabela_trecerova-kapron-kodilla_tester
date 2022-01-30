package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed:" + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Volvo)
            return "Volvo";
        else
            return "Unknown car name";
    }
}
