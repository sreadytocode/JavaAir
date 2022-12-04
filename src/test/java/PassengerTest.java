import Person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Maya", 3);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Maya", passenger.getName());
    }

    @Test
    public void passengerHasNumOfBags(){
        assertEquals(3, passenger.getNumOfBags());
    }

}
