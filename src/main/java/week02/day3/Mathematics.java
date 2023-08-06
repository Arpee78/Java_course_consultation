package week02.day3;

import java.util.Scanner;

public class Mathematics {

    public boolean isPrime(long number) {

        if (number<2){
            return false;
        }

        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egyszámot, megmondom prímszám-e: ");
        long number = scanner.nextLong();
        System.out.println(new Mathematics().isPrime(number) ? "Prímszám" : "Nem prímszám");

    }
}
