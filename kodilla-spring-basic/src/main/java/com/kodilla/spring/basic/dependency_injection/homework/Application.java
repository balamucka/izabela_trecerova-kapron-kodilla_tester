package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new CarDeliveryService();
        NotificationService notificationService = new CarNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 15);
    }
}
