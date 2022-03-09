package Homework;

import Homework.Airline;
import Homework.Airport;
import Homework.Flight;
import Homework.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface FlightManager {
	
	public static final RealFlightManager ourInstance = new RealFlightManager();
    public static final List<Flight> flights = null;

    static FlightManager getInstance() {

        return ourInstance;
	}
    
    String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity);
    
    Optional<Flight> getFlightByFlightNumber(String flightNumber);
}