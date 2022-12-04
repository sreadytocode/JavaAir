import Person.CabinCrewMember;
import Person.Passenger;
import Person.Pilot;
import Person.Rank;
import Plane.Flight;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;

    CabinCrewMember crewMember;
    Passenger passenger;

    @Before
    public void before() {
        CabinCrewMember crewMember1 = new CabinCrewMember("Steven", Rank.CAPTAIN);
        crewMember = new CabinCrewMember("Raquel", Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> crewMembers = new ArrayList<>();
        crewMembers.add(crewMember1);
        crewMembers.add(crewMember);

        ArrayList<Passenger> bookings = new ArrayList<>();
        pilot = new Pilot("Stephen", Rank.CAPTAIN, 64826);
        flight = new Flight(crewMembers, bookings, "JA7579");

    }

        @Test
        public void doesFlightHaveANumber(){
            assertEquals("JA7579", flight.getFlightNumber());
        }


    }









