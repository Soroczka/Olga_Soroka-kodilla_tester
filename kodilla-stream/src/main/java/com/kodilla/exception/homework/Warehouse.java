package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;


public class Warehouse {
    private List<Order> orders;

    public Warehouse(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getFirstElement(List<Order> orders) throws OrderDoesntExistException{
        return orders.get(1);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);

    }


//    public static Order getOrder(String number){
//        orders.stream()
//                .filter(o -> o.getNumber().equals(number))
//                .collect(Collectors.toList());
//
//       return orders.get(1);
//
//    }


//    public static Order getOrder(String number) {
//        Order order = orders.stream()
//                .filter(o -> o.getNumber().equals(number))
//                .findFirst()
//                .orElse(null);
//        return order;
//
//    }
}
