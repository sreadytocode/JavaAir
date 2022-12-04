package Plane;

import Person.CabinCrewMember;
import Person.Passenger;
import Person.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private ArrayList<Pilot> pilotList;

    private String flightNumber;

    private String departureAirport;

    private String destinationAirport;

    private String departureTime;

    Plane plane;

    Pilot pilot;

    public Flight(ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, ArrayList<Pilot> pilotList, String flightNumber, String departureAirport, String destinationAirport, String departureTime, Plane plane) {
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.pilotList = pilotList;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.plane = plane;
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

    public Plane getPlane() {
        return this.plane;
    }


    public int getCrewMembersCount() {
        return this.crewMembers.size();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public int getPilotCount() {
        return this.pilotList.size();
    }

    public int getSeats(){
        return this.plane.getType().getCapacity();
    }
    public int getAvailablePlaneSeats(){
        return this.plane.getType().getCapacity() - getPassengerCount();
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailablePlaneSeats() > 0){
            passengers.add(passenger);
        }

    }
}
