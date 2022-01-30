package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }



    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int speed = random.nextInt() * 100 + 1;
        int acceleration = random.nextInt() * 100 + 1;
        int braking = random.nextInt() * 100 + 1;
        if (drawnCarKind == 0)
            return new Skoda(speed, acceleration, braking);
        else if (drawnCarKind == 1)
            return new Toyota(speed,acceleration, braking);
        else
            return new Volvo(speed, acceleration, braking);

    }
}
