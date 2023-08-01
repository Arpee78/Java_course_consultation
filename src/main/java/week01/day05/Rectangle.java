package week01.day05;

public class Rectangle {

    private int sideA;

    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA(){
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int calculateArea(){
        return sideA*sideB;
    }
}
