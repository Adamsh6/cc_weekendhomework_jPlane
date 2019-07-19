import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Archibald", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Archibald", passenger.getName());
    }

    @Test
    public void canGetBagNumber(){
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void flightStartsNull(){
        assertNull(passenger.getFlight());
    }

    @Test
    public void seatNumberStartsZero(){
        assertEquals(0, passenger.getSeatNumber());
    }

    @Test
    public void canSetSeatNumber(){
        passenger.setSeatNumber(1);
        assertEquals(1, passenger.getSeatNumber());
    }

}
