package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    //Map<String, List<Flight>> flightInformation = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure){
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flights = flightRepository.getFlightsTable();
        List<Flight> result = new ArrayList<>();
        for (Flight flight: flights){
            if (flight.getDeparture().equals(departure)){
                result.add(flight);
            }
        }
        return result;

    }

    public List<Flight> findFlightsTo(String arrival){
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flights = flightRepository.getFlightsTable();
        List<Flight> result = new ArrayList<>();
        for (Flight flight: flights){
            if (flight.getArrival().equals(arrival)){
                result.add(flight);
            }
        }
        return result;
    }


}
