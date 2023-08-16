package week04.day3;

import java.util.Scanner;

public class Hangman {

    private String wordToFind;
    private String wordStatus;
    private int chances = 7;

    public Hangman(String wordToFind, int chances) {
        this.wordToFind = wordToFind;
        this.chances = chances;
        this.wordStatus = "_".repeat(wordToFind.length());
    }

    public static void main(String[] args) {
        new Hangman("almafa", 7).run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy szóra, kitalálod? " + chances + " próbálkozásod van.\n");

        while (chances > 0 && wordStatus.contains("_")) {
            System.out.print("Tipped? ");
            String guess = scanner.nextLine();
            if (wordToFind.contains(guess)) {
                wordStatus = updateWordStatus(guess);
                System.out.print(wordStatus);
                System.out.println("   Talált! Még " + chances + " próbálkozásod maradt.\n");
            } else {
                chances--;
                System.out.print(wordStatus);
                System.out.println("   Nem talált! Még " + chances + " próbálkozásod maradt.\n");
            }
        }

        if (wordStatus.contains("_")) {
            System.out.println("Vesztettél!");
        } else {
            System.out.println("Nyertél!");
        }

    }

    private String updateWordStatus(String guess) {
        char[] actualStatus = wordStatus.toCharArray();
        char guessChar = guess.charAt(0);
        for (int i = 0; i < wordToFind.length(); i++) {
            if (wordToFind.charAt(i) == guessChar) {
                actualStatus[i] = guessChar;
            }
        }
        return new String(actualStatus);
    }
}
