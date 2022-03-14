package com.kodilla.spring.basic.dependency_injection.homework;

public class BikeDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 0 && weight < 10) {
            System.out.println("Package delivery by bike.");
        } else {
            System.out.println("Package not delivery by bike.");
        }
        return true;
    }
}
