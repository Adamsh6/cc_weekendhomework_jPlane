import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {
    private String flightNumber;
    private Plane plane;
    private Airport origin;
    private Airport destination;
    private Date departureTime;
    private ArrayList<Passenger> passengers;
    private ArrayList<Integer> seatNumbers;

    public Flight(String flightNumber, Plane plane, Airport origin, Airport destination, Date departureTime) {
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
        this.seatNumbers = new ArrayList<Integer>();
        setUpSeats();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Integer> getSeatNumbers() {
        return seatNumbers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public int availableSeats() {
        return this.plane.getCapacity() - getPassengerCount();
    }

    public void setUpSeats(){
        for(int i = 1; i <= plane.getCapacity(); i++){
            this.seatNumbers.add(i);
        }
    }

    public void addPassenger(Passenger passenger) {
        if(availableSeats() > 0) {
            Random rand = new Random();
            this.passengers.add(passenger);
            passenger.setFlight(this);
            int randomIndex = rand.nextInt(this.seatNumbers.size() );
            int seatNumber = seatNumbers.get(randomIndex);
            passenger.setSeatNumber(seatNumber);
            seatNumbers.remove(randomIndex);
        }
    }
}
