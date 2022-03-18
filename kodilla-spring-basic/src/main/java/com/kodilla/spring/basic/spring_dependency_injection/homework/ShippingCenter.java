package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    @Resource(name = "bikeDeliveryService")
    private DeliveryService deliveryService;
    @Resource(name = "bikeNotificationService")
    private NotificationService notificationService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
