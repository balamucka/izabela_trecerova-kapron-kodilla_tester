package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightFinder = new HashMap<>();

    public void addFlight(String departure, String arrival) {


    }

    public List<Flight> findFlightsFrom(String departure) {
        return flightFinder.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
    return flightFinder.getOrDefault(arrival, Collections.emptyList());
    }

    public int size() {
        return flightFinder.size();
    }
}
