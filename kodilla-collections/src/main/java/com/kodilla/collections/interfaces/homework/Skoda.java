package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Skoda implements Car{

    private int speed;
    private int acceleration;
    private int braking;



    public Skoda(int speed, int acceleration, int braking) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.braking = braking;

    }

    @Override
    public int getSpeed() {
        return speed = acceleration*3 - braking*2;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed+acceleration);
    }

    @Override
    public void decreaseSpeed() {
      System.out.println(speed-braking);
    }

    @Override
    public String toString() {
        return "Skoda{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", braking=" + braking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skoda skoda = (Skoda) o;
        return speed == skoda.speed && acceleration == skoda.acceleration && braking == skoda.braking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, braking);
    }
}
