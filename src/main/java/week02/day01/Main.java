package week02.day01;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        GasStation gasStation = new GasStation(480);
        int refuellingPrice = gasStation.refuel(myCar, 20);
        myCar.setDistance(260);
        System.out.println(myCar.getGasConsumption());
        System.out.println("Vásárolt benzin ára: " +  refuellingPrice );

    }
}
