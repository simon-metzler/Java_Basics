package at.sim.games;

import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        boolean isGameRunning = true;
        String[] words = {"Damien", "Elina", "Java", "Javascript", "Fenster", "Einstein", "Laptop"};
        Scanner scanner = new Scanner(System.in);

        while (isGameRunning) {
            String randomWord = words[randomNumberGenerator.nextInt(words.length)];
            boolean isGuessing = true;
            String secretLetters = getSecretLetters(randomWord, 5);
            String guessedLetters = new String();

            printWord(randomWord, secretLetters, guessedLetters);
            System.out.println();

            while (isGuessing) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                guessedLetters += input.toLowerCase();
                isGuessing = printWord(randomWord, secretLetters, guessedLetters);
                System.out.println();

            }
            System.out.println("Finished Game!");
            System.out.println("Write q to quit.");
            String input = scanner.nextLine();
            if (input.contains("q")) {;
                isGameRunning = false;
            }
        }
    }

    public static String getSecretLetters (String word, int amount) {
        Random randomNumberGenerator = new Random();
        String secret_letters = new String();
        String[] letter_list = word.split("");
        for (int i = 0; i < amount; i++) {
            secret_letters += letter_list[randomNumberGenerator.nextInt(letter_list.length)].toLowerCase();
        }
        return secret_letters;

    }

    public static boolean printWord (String word, String secretLetters, String guessedLetters) {
        String[] word_list = word.split("");
        boolean guessingCompleted = true;
        for (String character : word_list) {
            if (secretLetters.contains(character.toLowerCase()) && !guessedLetters.contains(character.toLowerCase())) {
                System.out.print("*");
                guessingCompleted = false;
            } else {
                System.out.print(character);
            }
        }
        return !guessingCompleted;
    }
}
