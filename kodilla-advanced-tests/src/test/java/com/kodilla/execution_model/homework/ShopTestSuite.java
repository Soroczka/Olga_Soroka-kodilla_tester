package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {


    Shop shop = new Shop();
    Order order1 = new Order(123.45, LocalDate.of(2022, 8, 8), "mania123");
    Order order2 = new Order(333.45, LocalDate.of(2022, 8, 7), "ksenia");
    Order order3 = new Order(1234.56, LocalDate.of(2022, 7, 31), "mireczek");
    Order order4 = new Order(555.35, LocalDate.of(2022,7,29), "wafffel");
    Order order5 = new Order(5555, LocalDate.of(2022,7,29), "oreo");
    Order order6 = new Order(454, LocalDate.of(2022,7,21), "cappuczyno");


    @Test
    void addOrdersAndCheckIsSizeChanged() {
        //Given
        //When
        int result = shop.getSize();
        //Then
        assertEquals(6, result);
    }

    @Test
    void addExistingOrderAndCheckSizeNotChanged(){
        //Given
        Order order7 = order6;
        //When
        shop.addOrder(order7);
        int result = shop.getSize();
        //Then
        assertEquals(6, result);
    }

    @Test
    void addNewOrderAndCheckIsAllFieldsHaveProperValues(){
        //Given
        Order order7 = new Order(4545, LocalDate.of(2022,7,21), "samanta");
        //When
        shop.addOrder(order7);
        LocalDate dateResult = order7.getDate();
        String usernameResult = order7.getUsername();
        double priceResult = order7.getPrice();
        //Then
       // assertEquals(7, orders.size());
        assertEquals(LocalDate.of(2022,7,21), dateResult);

    }

    @Test
    void shouldReturnListWithElementsFromPriceRange() {
        //Given
        List<Order> orders = shop.returnOrdersForPrices(100, 500);
        //When
        int result = orders.size();
        //Then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnEmptyListWhenAnyHasPriceInSelectedRange() {
        //Given
        List<Order> orders = shop.returnOrdersForPrices(0, 100);
        //When
        int result = orders.size();
        //Then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnEmptyListForPriceRangeWhenAreNoElementsInCollection() {
        //Given
        shop.removeAll();
        List<Order> orders = shop.returnOrdersForPrices(100, 1000);
        //When
        int result = orders.size();
        //Then
        assertEquals(0, result);
    }


    @Test
    void shouldReturnOrdersForDates() {
        //Given
        LocalDate from = LocalDate.of(2022,7,21);
        LocalDate to = LocalDate.of(2022,7,31);
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnAllOrdersToDateToWhenDateFromIsNull() {
        //Given
        LocalDate from = null;
        LocalDate to = LocalDate.of(2022, 07, 31);
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnAllOrdersWhenDatesAreNull() {
        //Given
        shop.addOrder(new Order(123.45, LocalDate.now(), "cappuczyno"));
        LocalDate from = null;
        LocalDate to = null;
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(7, result);
    }

    @Test
    void shouldReturnAllOrdersFromDateToTodayWhenDateToIsNull() {
        //Given
        shop.addOrder(new Order(123.45, LocalDate.now(), "cappuczyno"));
        LocalDate to = null;
        LocalDate from = LocalDate.of(2022, 07, 31);
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnEmptyListForDatesOutOfRange() {
        //Given
        LocalDate from = LocalDate.of(2022,7,10);
        LocalDate to = LocalDate.of(2022,7,20);
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnEmptyListForDatesRangeWhenCollectionIsEmpty() {
        //Given
        shop.removeAll();
        LocalDate from = LocalDate.of(2022,7,10);
        LocalDate to = LocalDate.of(2022,7,20);
        List<Order> orders = shop.returnOrdersForDates(from, to);
        //When
        int result = orders.size();
        //Then
        assertEquals(0, result);
    }


    @Test
    void getSizeWhenOrdersAreInCollection() {
        //Given
        //When
        int result = shop.getSize();
        //Then
        assertEquals(6, result);
    }

    @Test
    void getSizeWhenAreNoOrdersInCollection() {
        //Given
        shop.removeAll();
        //When
        int result = shop.getSize();
        //Then
        assertEquals(0, result);
    }

    @Test
    void sumAllOrders() {
        //Given
        //When
        double expected = order1.getPrice() + order2.getPrice() + order3.getPrice() + order4.getPrice() + order5.getPrice() + order6.getPrice();
        double result = shop.sumAllOrders();
        //Then
        assertEquals(expected, result, 0.01);
    }


    @BeforeEach
    public void initializeOrdersList() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }
}