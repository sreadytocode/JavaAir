import Person.CabinCrewMember;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember crewMember;

    @Before
    public void before(){
        crewMember = new CabinCrewMember("Steven", Rank.CAPTAIN);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Steven", crewMember.getName());
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(Rank.CAPTAIN, crewMember.getRank());
    }

    @Test
    public void talkToPassengers(){
        assertEquals("Welcome to JavaAirlines", crewMember.talk());
    }

}
