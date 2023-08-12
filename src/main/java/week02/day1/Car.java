package week02.day1;

public class Car {

    private int filledGas;

    private int distance;

    public void setFilledGas(int filledGas) {
        this.filledGas = filledGas;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getGasConsumption(){
        return filledGas*100.0/distance;
    }
}
