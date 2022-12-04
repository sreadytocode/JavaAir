import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Stephen", Rank.CAPTAIN, 64826);
    }

    @Test
    public void pilotHasName(){
        assertEquals("Stephen", pilot.getName());
    }

    @Test
    public void pilotHasARank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals(64826, pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("I am flying the plane lalalaa", pilot.flyPlane());
    }

}
