package Homework;

import java.util.HashMap;
import java.util.Map;

import Homework.Airline;
import Homework.Airport;
import Homework.NullParameterException;
import Homework.BadParameterException;


public class FlightFactory {
	
	private static Map<String, Flight> FlightCache = new HashMap<>();
	
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }

        else return null;
    }
    public static Flight createFlight2(String type, Airline airline, Airport origin, Airport destination, Integer passengerCapacity) throws BadParameterException {
        if (type.equals("PasssengerFlight")) {
            try {
                return new PassengerFlight(airline, origin, destination, passengerCapacity);
            } catch(NullParameterException e) {
                return null;
            }
        }

        else return null;
    }
    
    private static Flight getAirline(String name){
    	return FlightCache.computeIfAbsent(name, newName -> {
    		try {
				return (Flight) new Airline(name);
			} catch (NullParameterException e) {
				e.printStackTrace();
			} catch (BadParameterException e) {
				e.printStackTrace();
			}
			return null;
    	});

    }
    
    private static Flight getAirport(String name) throws NullParameterException, BadParameterException {
    	
	    	return FlightCache.computeIfAbsent(name, newName -> {
	    		try {
					return (Flight) new Airport(name);
				} catch (NullParameterException e) {
					e.printStackTrace();
				} catch (BadParameterException e) {
					e.printStackTrace();
				}
				return null;
	    	});	
    }
}
