package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlightsTable() {
        flights.add(new Flight("Warsaw", "Barcelona"));
        flights.add(new Flight("Barcelona", "Cracow"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("London", "Warsaw"));
        return flights;
    }
}

