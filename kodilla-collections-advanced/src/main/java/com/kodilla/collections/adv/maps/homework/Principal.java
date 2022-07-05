package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String firstName;
    private String lastName;

    public Principal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Principal " + firstName + " " +  lastName;
    }
}
