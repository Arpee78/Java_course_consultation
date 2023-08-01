package week01.day03;

import java.util.Scanner;

public class Person2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét! ");
        String name = scanner.nextLine();

        System.out.println("Adja meg a születési helyét! ");
        String placeOfBirth = scanner.nextLine();

        System.out.println("Adja meg a születési dátumát! ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Adja meg az anyja nevét! ");
        String nameOfMother = scanner.nextLine();

        System.out.println();
        System.out.println("Név: " + name);
        System.out.println("Születési hely, idő: " + placeOfBirth + ", " + dateOfBirth);
        System.out.println("Anyja neve: " + nameOfMother);

    }
}
