package week06.day4;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return new ArrayList<>(rides);
    }

    public void addRide(Ride ride) {
        int rideDay = ride.getDay();
        if (rideDay < 1 || rideDay > 7) {
            throw new IllegalArgumentException("The weekday number is not between 1-7");
        }

        if (rides.isEmpty()) {
            validateRideNumber1(ride);
            rides.add(ride);
        } else {
            Ride lastRide = rides.get(rides.size() - 1);
            int lastRideDay = lastRide.getDay();

            if (lastRideDay > rideDay) {
                throw new IllegalArgumentException("This is not a possible ride.");
            }

            if (lastRideDay == rideDay) {
                if (ride.getRideNumber() != lastRide.getRideNumber() + 1) {
                    throw new IllegalArgumentException("This is not a possible ride.");
                }
            }

            if (lastRideDay < rideDay) {
                validateRideNumber1(ride);
            }
            rides.add(ride);
        }

    }

    private void validateRideNumber1(Ride ride) {
        if (ride.getRideNumber() != 1) {
            throw new IllegalArgumentException("The ride number is incorrect");
        }
    }


}
