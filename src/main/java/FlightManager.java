import java.util.ArrayList;

public class FlightManager {
    private static int baggageWeight = 50;

    public static int getBaggageWeightOfPassenger(Passenger passenger){
        return passenger.getBags() * baggageWeight;
    }

    public static int getTotalBaggageWeightBookedOnFlight(Flight flight1) {
        ArrayList<Passenger> passengers = flight1.getPassengers();
        int totalBaggageWeight = 0;
        for(Passenger passenger : passengers){
            totalBaggageWeight += getBaggageWeightOfPassenger(passenger);
        }
        return totalBaggageWeight;
    }

    public static int getRemainingWeightForBaggage(Flight flight) {
        return (flight.getPlane().getTotalWeight() / 2) - getTotalBaggageWeightBookedOnFlight(flight);
    }
}
