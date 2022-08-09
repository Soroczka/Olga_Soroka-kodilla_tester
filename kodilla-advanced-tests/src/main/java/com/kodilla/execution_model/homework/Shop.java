package com.kodilla.execution_model.homework;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeAll(){
        orders.clear();
    }

    public List<Order> returnOrdersForDates (LocalDate dateFrom, LocalDate dateTo){
        List<Order> newOrdersList = new ArrayList<>();
        if (dateFrom == null) dateFrom = LocalDate.MIN;
//        if (dateFrom == null && dateTo == null){
//            dateFrom = LocalDate.MIN;
//            dateTo = LocalDate.now();
//        }
        if (dateTo == null) dateTo = LocalDate.now();
        for(Order order: orders){
            if((order.getDate().isBefore(dateTo) || order.getDate().isEqual(dateTo)) &&
                    (order.getDate().isAfter(dateFrom) || order.getDate().isEqual(dateFrom))){
                newOrdersList.add(order);
            }
        }
        return newOrdersList;
    }

    public List<Order> returnOrdersForPrices (double priceFrom, double priceTo){
        List<Order> newOrdersList = new ArrayList<>();
        for(Order order: orders){
            if(order.getPrice() >= priceFrom && order.getPrice()<= priceTo){
                newOrdersList.add(order);
            }
        }
        return newOrdersList;
    }

    public int getSize(){
        return this.orders.size();
    }

    public double sumAllOrders(){
        double sum = 0.0;
        for(Order order: orders){
            sum += order.getPrice();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}

class aaa{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 12, 10);
        Order order = new Order(123.34, LocalDate.of(2022, 12, 10), "kasia");

    }
}