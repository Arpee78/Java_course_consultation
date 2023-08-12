package week01.day5;

public class Geometry {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("sideaA: " + rectangle.getSideA());
        System.out.println("sideaB: " + rectangle.getSideB());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
