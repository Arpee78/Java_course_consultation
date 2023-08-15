package week03.day5;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (maxCapacity>passengers.size()) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int getNumberOfPackages() {
        int numberOfPackages = 0;
        for (Passenger actual : passengers) {
            numberOfPackages += actual.getNumberOfLuggage();
        }
        return numberOfPackages;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
