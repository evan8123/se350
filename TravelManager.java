package Homework;
import Homework.Airline;
import Homework.Airport;
import Homework.BadParameterException;
import Homework.NullParameterException;
import Homework.CommercialFlight;
import Homework.Flight;

import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            //CommercialFlight commercialFlight = new CommercialFlight(airline, origin, destination);
            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

            System.out.println(flight.get());
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
        /*
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");
            Integer num = 5;

            String flightNumber2 = FlightManager.getInstance().createFlight2("PassengerFlight", airline, origin, destination, num);
            Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);

            System.out.println(flight2.get());
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
        */
    }

}