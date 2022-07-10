package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        String flightFrom = "Warsaw";
        //When
        List<Flight> result = flightFinder.findFlightsFrom(flightFrom); //tu znachodzi ilosc rekordów z Warszawą jako departure
        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight(null, flightFrom));
        assertEquals(expectedList.size(), result.size());

    }

    @Test
    void findFlightsTo() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        String flightTo = "Warsaw";
        //When
        List<Flight> result = flightFinder.findFlightsTo(flightTo); //tu znachodzi ilosc rekordów z Warszawą jako arrival
        //Then
        assertEquals(2, result.size());
    }
}