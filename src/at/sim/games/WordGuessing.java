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
            String visibleLetters = getVisibleLetters(randomWord, 3);

            printWord(randomWord, visibleLetters);
            System.out.println();

            while (isGuessing) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                visibleLetters += input.toLowerCase();
                printWord(randomWord, visibleLetters);
                System.out.println();
                isGuessing = isGameRunning(randomWord, visibleLetters);

            }
            System.out.println("Finished Game!");
            System.out.println("Write q to quit, p to play again.");
            String input = scanner.nextLine();
            if (input.contains("q")) {;
                isGameRunning = false;
            }
        }
    }

    public static String getVisibleLetters(String word, int amount) {
        Random randomNumberGenerator = new Random();
        String visibleLetters = new String();
        String[] letter_list = word.split("");
        for (int i = 0; i < amount; i++) {
            visibleLetters += letter_list[randomNumberGenerator.nextInt(letter_list.length)].toLowerCase();
        }
        return visibleLetters;

    }

    public static void printWord (String word, String visibleLetters) {
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (visibleLetters.contains(character.toLowerCase())) {
                System.out.print(character);
            } else {
                System.out.print("*");

            }
        }
    }

    public static boolean isGameRunning(String word, String visibleLetters) {
        boolean gameRunning = false;
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (!visibleLetters.contains(character.toLowerCase())) {
                gameRunning = true;
            }
        }

        return gameRunning;
    }
}
