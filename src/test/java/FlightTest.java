import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Date date;

    @Before
    public void setUp(){
        date = new Date(2019,07,21, 22, 00);
        plane1 = new Plane(PlaneType.DOUGLASDC3);
        flight1 = new Flight("FL387", plane1, Airport.LAX, Airport.EDI, date);
        passenger1 = new Passenger("Archibald", 2);
        passenger2 = new Passenger("Gerald", 2);
        passenger3 = new Passenger("Niaster", 2);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("FL387", flight1.getFlightNumber());
    }

    @Test
    public void canGetOrigin(){
        assertEquals(Airport.LAX, flight1.getOrigin());
    }

    @Test
    public void canGetDestination(){
        assertEquals(Airport.EDI, flight1.getDestination());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals(date, flight1.getDepartureTime());
    }

    @Test
    public void passengerListStartsOffEmpty(){
        assertEquals(0, flight1.getPassengerCount());
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void canReturnNumberOfSeatsIfEmpty(){
        assertEquals(3, flight1.availableSeats());
    }

    @Test
    public void canReturnNumberOfSeatsWithPassengers(){
        flight1.addPassenger(passenger1);
        assertEquals(2, flight1.availableSeats());
    }

    @Test
    public void canAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerIfFull(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        assertEquals(3, flight1.getPassengerCount());
    }

    @Test
    public void passengerKnowsItIsAssignedToFlight(){
        flight1.addPassenger(passenger1);
        assertEquals(flight1, passenger1.getFlight());
    }

    @Test
    public void canSetUpSeatNumbers() {
        assertEquals(3, flight1.getSeatNumbers().size());
    }

    @Test
    public void  canAssignRandomSeatNumber(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
    }
}
