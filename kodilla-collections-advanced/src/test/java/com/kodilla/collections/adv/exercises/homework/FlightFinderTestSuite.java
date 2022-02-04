package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
       FlightFinder flightFinder = new FlightFinder();
       flightFinder.addFlight("Kraków", "Oslo");

       List<Flight> result = flightFinder.findFlightsFrom("Kraków");
    }

    @Test
    public void testFindFlightTo() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight("Wrocław", "Londyn");

        List<Flight> result = flightFinder.findFlightsTo("Londyn");
    }
}