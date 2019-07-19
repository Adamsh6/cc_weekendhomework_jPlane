import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight1;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp(){
        Date date = new Date(2019, 7, 21, 22, 0);
        plane1 = new Plane(PlaneType.DOUGLASDC3);
        flight1 = new Flight("FL387", plane1, Airport.LAX, Airport.EDI, date);
        passenger1 = new Passenger("Archibald", 2);
        passenger2 = new Passenger("Crane", 1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
    }

    @Test
    public void canCalculateBaggageWeightForPassenger(){
        assertEquals(100, FlightManager.getBaggageWeightOfPassenger(passenger1));
    }

    @Test
    public void canCalculateTotalBaggageWeightBookedForFlight(){
        assertEquals(150, FlightManager.getTotalBaggageWeightBookedOnFlight(flight1));
    }

    @Test
    public void canCalculateRemainingWeightForBaggage(){
        assertEquals(50, FlightManager.getRemainingWeightForBaggage(flight1));
    }
}
