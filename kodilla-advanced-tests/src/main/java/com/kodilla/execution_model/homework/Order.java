package com.kodilla.execution_model.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Order {
    private double price;
    private LocalDate date;
    private String username;

    public Order(double price, LocalDate date, String username) {
        this.price = price;
        this.date = date;
        this.username = username;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                ", username='" + username + '\'' +
                '}';
    }
}
