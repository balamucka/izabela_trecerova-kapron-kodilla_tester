package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CarNotificationService implements NotificationService{

    @Override
    public String success(String address) {
        return "Package delivered to: " + address + ", by car";
    }

    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
