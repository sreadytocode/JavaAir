import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;



    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(366, plane.getType().getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(735000.00, plane.getType().getWeight(), 0);
    }
}
