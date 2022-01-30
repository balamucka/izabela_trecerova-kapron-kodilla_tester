package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;
    private int acceleration;
    private int braking;

    public Toyota(int speed, int acceleration, int braking) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.braking = braking;
    }

    @Override
    public int getSpeed() {
        return speed = acceleration * 3 - braking * 2;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + acceleration);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - braking);
    }
}
