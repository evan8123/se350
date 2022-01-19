package Homework;
import algs12.Date;
public class Main {
	public static void main(String[] args) {
        Airline line = new Airline("America");
        Airport fPort = new Airport("ORD");
        Airport tPort = new Airport("MDW");
        Flight flight1 = new Flight(line,fPort,tPort);
        System.out.println(flight1);
	}
}

