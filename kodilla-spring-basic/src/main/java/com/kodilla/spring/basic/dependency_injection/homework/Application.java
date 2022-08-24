package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        AmazonDeliveryService amazonDeliveryService = new AmazonDeliveryService();
        NotificationService notificationService = new AmazonNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(amazonDeliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.sendPackage("Hill Street 11, New York", 31);
    }
}