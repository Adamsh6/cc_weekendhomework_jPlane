import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.DOUGLASDC3);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.DOUGLASDC3, plane1.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, plane1.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(400, plane1.getTotalWeight());
    }

}
