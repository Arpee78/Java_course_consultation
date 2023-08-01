package week02.day01;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int refuel(Car car, int amount){
        car.setFilledGas( amount );
        return amount*price;
    }

}
