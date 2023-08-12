package week02.day5;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Gondoltam egy számra 1 és 100 között, kitalálod? Hat próbálkozásod van.");
        int number = new Random().nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);

        System.out.println(number);

        boolean gotIt = false;

        for (int i = 0; i < 6 && !gotIt; i++) {
            System.out.print("Próbálkozás " + (i + 1) + ": ");
            int res = scanner.nextInt();
            if (res == number) {
                System.out.println("Bingó!");
                gotIt = true;
            } else {
                System.out.print("Nem nyert, még " + (5 - i) + " alkalommal próbálkozhatsz. ");
                System.out.println("A szám egyébként " + (number > res ? "nagyobb!" : "kisebb!"));
            }
        }

        System.out.println(gotIt ? "Gratulálok!" : "Most nem nyertél, de máskor sikeresebb leszel!");

    }
}
