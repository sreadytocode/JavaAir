package Plane;

import Person.CabinCrewMember;
import Person.Passenger;

import java.util.ArrayList;

public class Flight {
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private String flightNumber;

    public Flight(ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, String flightNumber) {
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
