package Homework;
import Homework.Airline;
import Homework.Airport;
import Homework.NullParameterException;
import Homework.BadParameterException;

import Homework.Airline;
import Homework.Airport;
import Homework.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }
}