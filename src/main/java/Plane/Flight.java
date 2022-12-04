package Plane;

import Person.CabinCrewMember;
import Person.Passenger;

import java.util.ArrayList;

public class Flight {
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private String flightNumber;

    private String departureAirport;

    private String destinationAirport;

    private String departureTime;

    public Flight(ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, String flightNumber, String departureAirport, String destinationAirport, String departureTime) {
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
