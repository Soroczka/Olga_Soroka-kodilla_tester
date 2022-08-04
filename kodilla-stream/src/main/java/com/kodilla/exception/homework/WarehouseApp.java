package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        //Warehouse warehouse = new Warehouse(orders);
        orders.add(new Order("12345"));
        orders.add(new Order("33344"));
        orders.add(new Order("43214"));
        Warehouse.getOrder("1235");

    }
}
