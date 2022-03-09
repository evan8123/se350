package Homework;
import java.util.Optional;

import algs12.Date;
public class Main {
	public static void main(String[] args) throws NullParameterException, BadParameterException, Exception {
		Airline airline = AirlineFactory.getAirline("delta");
        Airport origin = AirportFactory.getAirport("ORD");
        Airport destination = AirportFactory.getAirport("DFW");
        //String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, 0);
        //Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);
        //System.out.print(flight.get());
        
        FlightManager flightManager = new FlightManagerProxy();
        flightManager.createFlight("passengerFlight",airline, origin, destination,5);
        System.out.println();
        String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, 0);
        flightManager.getFlightByFlightNumber(flightNumber);
       
	}
}

