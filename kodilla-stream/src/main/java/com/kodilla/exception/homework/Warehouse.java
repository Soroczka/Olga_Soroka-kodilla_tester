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

//    public Order getOrder(String number) throws OrderDoesntExistException {
//        try {
//            return orders.stream()
//                .filter(o -> o.getNumber().equals(number))
//                .findFirst()
//                .orElseThrow(OrderDoesntExistException::new);
//        }
//        catch (OrderDoesntExistException e) {
//            System.out.println("Order does not exist");
//            return null;
//        }
//        finally {
//            System.out.println("Was searching for number: " +number);
//        }
//    }

    public Order getOrder(String number) throws OrderDoesntExistException {

            return orders.stream()
                    .filter(o -> o.getNumber().equals(number))
                    .findFirst()
                    .orElseThrow(OrderDoesntExistException::new);

    }






}
