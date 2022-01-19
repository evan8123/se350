package Homework;
import Homework.Airport;
import algs12.Date;
import Homework.Airline;
import java.util.UUID;
import java.util.Random;

public class Flight {
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private UUID flightNumber;
	private Date departureTime;

	public Flight(Airline line, Airport from, Airport to) {
		setAirline(line);
		setOrigin(from);
		setDestination(to);
		setFlightNumber(UUID.randomUUID());
		Random rand = new Random();
		int low = 1;
		int high = 13;
		int result = rand.nextInt(high-low) + low;
		Random rand2 = new Random();
		int low2 = 1;
		int high2 = 31;
		int result2 = rand2.nextInt(high2-low2) + low2;
		int year = 2022;
		Date when = new Date(result+"/"+result2+"/"+year);
		setDate(when);
	}

	public Airline getAirline() {
		return airline;
	}
	private void setAirline(Airline fLine) throws IllegalArgumentException{
		if(fLine == null){
			throw new IllegalArgumentException ("Null value passed in to setAirline");
		}
		airline = fLine;
	}
	
	public Airport getOrigin() {
		return origin;
	}
	private void setOrigin(Airport fPort) throws IllegalArgumentException{
		if(fPort == null){
			throw new IllegalArgumentException ("Null value passed in to setAirline");
		}
		origin = fPort;
	}
	
	public Airport getDestination() {
		return destination;
	}
	private void setDestination(Airport tPort) throws IllegalArgumentException{
		if(tPort == null){
			throw new IllegalArgumentException ("Null value passed in to setAirline");
		}
		destination = tPort;
	}
	
	public UUID getFlightNumber() {
		return flightNumber;
	}
	private void setFlightNumber(UUID num) throws IllegalArgumentException{
		if(num == null){
			throw new IllegalArgumentException ("Null value passed in to setAirline");
		}
		flightNumber = num;
	}
	
	public Date getDate() {
		return departureTime;
	}
	private void setDate(Date day) throws IllegalArgumentException{
		if(day == null){
			throw new IllegalArgumentException ("Null value passed in to setAirline");
		}
		departureTime = day;
	}
	
	
	public boolean equals(Object object) {
		final Flight other = (Flight) object;
		if (getAirline().equals(other.getAirline()) && getOrigin().equals(other.getOrigin()) && getDestination().equals(other.getDestination()) 
				&& getFlightNumber().equals(other.getFlightNumber()) && getDate().equals(other.getDate())) {
			return true;
		}
		else {return false;}
	}
	public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getAirline().hashCode();
        result = 31 * result + getOrigin().hashCode();
        result = 31 * result + getDestination().hashCode();
        result = 31 * result + getFlightNumber().hashCode();
        result = 31 * result + departureTime.hashCode();
        return result;
    }
	public java.lang.String toString() {
		StringBuilder sb = new StringBuilder();
        return "Airline:        "+getAirline()+
        		"\nOrigin:         "+getOrigin()+
        		"\nDestination:    "+getDestination()+
        		"\nFlight Number:  "+getFlightNumber()+
        		"\nDate:           "+getDate();
        		
    }

}

