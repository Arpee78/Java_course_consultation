package week06.day4;

public class Ride {

    private int day;
    private int rideNumber;
    private int km;

    public Ride(int day, int rideNumber, int km) {
        this.day = day;
        this.rideNumber = rideNumber;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getRideNumber() {
        return rideNumber;
    }

    public int getKm() {
        return km;
    }
}
