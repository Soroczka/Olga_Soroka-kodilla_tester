package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        List<Order> orders = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orders);
        warehouse.addOrder(new Order("12345"));
        warehouse.addOrder(new Order("43214"));
        warehouse.getOrder("43214");
        warehouse.getOrder("1235");
        warehouse.getOrder("222");
    }
}
