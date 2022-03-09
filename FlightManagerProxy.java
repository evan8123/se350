package Homework;
import Homework.Airline;
import Homework.Airport;
import Homework.Flight;
import Homework.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightManagerProxy extends RealFlightManager{
	
	private static FlightManager realObject;

	@Override
	public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
		System.out.println("A flight is being created.");
		if (realObject == null){
			realObject = new RealFlightManager();	
		}
		return realObject.createFlight(type, airline, origin, destination, passengerCapacity);
	}
	public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
		System.out.println("Flight number: "+flightNumber+" is being retrieved.");
	
		if (realObject == null){
			realObject = new RealFlightManager();	
		}
		return realObject.getFlightByFlightNumber(flightNumber);
	}
}