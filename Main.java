package Homework;
import algs12.Date;
public class Main {
	public static void main(String[] args) throws NullParameterException, BadParameterException {
		Airline line2 = new Airline("America");
    	Airport fPort2 = new Airport("ORD");
    	Airport tPort2 = new Airport("MDW");
		CommercialFlight flight2 = new CommercialFlight(line2,fPort2,tPort2);
		System.out.print("Commercial Flight" + "\n"+flight2);
		Airline line = new Airline("America");
    	Airport fPort = new Airport("ORD");
    	Airport tPort = new Airport("MDW");
    	Integer num = 15;
		PassengerFlight flight = new PassengerFlight(line,fPort,tPort,num);
		System.out.print("\nPassenger Flight" + "\n"+flight);
		
	}
}

