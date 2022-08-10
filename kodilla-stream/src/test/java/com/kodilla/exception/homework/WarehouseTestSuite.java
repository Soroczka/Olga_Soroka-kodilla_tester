package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    static List<Order> orders = new ArrayList<>();
    static Warehouse warehouse = new Warehouse(orders);


    static void initializeOrders(){
        warehouse.addOrder(new Order("12345"));
        warehouse.addOrder(new Order("12346"));
        warehouse.addOrder(new Order("12347"));
    }

    @Test
    void addOrderAndCheckIsSizeCorrect() {
        //Given
        WarehouseTestSuite.initializeOrders();
        Order order1 = new Order("17891");
        //When
        warehouse.addOrder(order1);
        //Then
        assertEquals(4, orders.size());
    }

    @Test
    void checkIsOrderExistsInList() throws OrderDoesntExistException {
        //Given
        Order order = new Order("33345");
        warehouse.addOrder(order);
        //When
        Order result = warehouse.getOrder("33345");
        //Then
        assertEquals(order, result);
    }

    @Test
    void checkIsOrderExistsInListWhenShouldnt() throws OrderDoesntExistException {
        //Given
        WarehouseTestSuite.initializeOrders();
        //When
        //Then
        //assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("33345"));
    }
}