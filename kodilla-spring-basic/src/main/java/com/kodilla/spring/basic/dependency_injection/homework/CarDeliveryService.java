package com.kodilla.spring.basic.dependency_injection.homework;

public class CarDeliveryService implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10 && weight < 200) {
            System.out.println("Package delivered by car");
        } else {
            System.out.println("Package not delivered by car");
        }
        return true;
    }
}
