package Homework;

import Homework.Airline;
import Homework.Airport;
import Homework.Flight;
import Homework.FlightFactory;
import Homework.FlightManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RealFlightManager implements FlightManager{

    private static RealFlightManager ourInstance;
    private static List<Flight> flights;

    public  RealFlightManager getInstance() {
        if (ourInstance == null)
            ourInstance = new RealFlightManager();

        return ourInstance;
    }

    protected RealFlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
        flights.add(flight);
        System.out.println("Your "+type+" flight with "+airline+" from "+origin+" to "+destination+" with "+passengerCapacity+" passengers has been created.");

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
    	System.out.println(flights.stream()
        .filter(flt -> flt.getFlightNumber().equals(flightNumber))
        .findFirst());
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}