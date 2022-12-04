import Person.CabinCrewMember;
import Person.Passenger;
import Person.Pilot;
import Person.Rank;
import Plane.Flight;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;


    CabinCrewMember crewMember;

    Passenger passenger;
    Plane plane;

    @Before
    public void before() {
        CabinCrewMember crewMember1 = new CabinCrewMember("Steven", Rank.CAPTAIN);
        crewMember = new CabinCrewMember("Raquel", Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> crewMembers = new ArrayList<>();
        crewMembers.add(crewMember1);
        crewMembers.add(crewMember);


        plane = new Plane(PlaneType.BOEING747);

        ArrayList<Passenger> bookings = new ArrayList<>();

        pilot = new Pilot("Steven", Rank.CAPTAIN, 64826);
        ArrayList<Pilot> pilotList = new ArrayList<>();
        pilotList.add(pilot);

        flight = new Flight(crewMembers, bookings, pilotList, "JA7579", "GLA", "ORY", "11.55", plane);

    }

        @Test
        public void doesFlightHaveANumber(){
            assertEquals("JA7579", flight.getFlightNumber());
        }

        @Test
        public void doesFlightHaveDepartureAirport(){
            assertEquals("GLA", flight.getDepartureAirport());
        }

        @Test
        public void doesFlightHaveDestinationAirport(){
            assertEquals("ORY", flight.getDestinationAirport());
        }

        @Test
        public void doesFlightHaveDepartureTime(){
            assertEquals("11.55", flight.getDepartureTime());
        }

        @Test
        public void getPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
        }

        @Test
        public void doesFlightHaveAPilot(){
        assertEquals(1, flight.getPilotCount());
        }

        @Test
        public void doesFlightHaveAPlane(){
        assertEquals(plane, flight.getPlane());
        }

        @Test
        public void doesFlightHaveCrewMembers(){
        assertEquals(2, flight.getCrewMembersCount());
        }

        @Test
        public void doesFlightHavePassengers(){
        assertEquals(0, flight.getPassengerCount());
        }

        @Test
        public void getFlightNumberOfAvailableSeats(){
        assertEquals(366, flight.getAvailablePlaneSeats());
        }

        @Test
        public void bookPassengerIfRemainingSeats(){
        passenger = new Passenger("Maya", 3);
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());

        }


    }









