package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {
    private static List<Order> orders = new ArrayList<>();

    private static void addOrder(Order order){
        orders.add(order);
    }

//    public static Order getOrder(String number){
//        orders.stream()
//                .filter(o -> o.getNumber().equals(number))
//                .collect(Collectors.toList());
//
//       return orders.get(1);
//
//    }



//    public static Order getOrder(String number){
//        orders.stream()
//                .filter(o -> o.getNumber().equals(number))
//                .collect(Collectors.toList());
//
//        return orders.get(0);
//
//    }

    public static Order getOrder(String number){
        Order order = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst()
                .orElse(null);
        return order;

    }
}
