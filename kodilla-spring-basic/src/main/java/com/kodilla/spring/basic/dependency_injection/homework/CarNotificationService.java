package com.kodilla.spring.basic.dependency_injection.homework;

public class CarNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + ", by car");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
