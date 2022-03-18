package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.DeliveryService;

public class CarDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10 && weight < 30) {
            return false;
        }
        return true;
    }
}
