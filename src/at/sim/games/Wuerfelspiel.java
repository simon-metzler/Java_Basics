package at.sim.games;

import java.util.Random;
import java.util.Scanner;
public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Würfelspiel");

        while (true) {
            print_header();
            int prompt = scanner.nextInt();
            if (prompt == 1) {
                int playerNumber = get_dice_number();
                int computerNumber = get_dice_number();
                System.out.println("Du würfelst: " + playerNumber + ", Der Computer würfelt: " + computerNumber);
                if (playerNumber > computerNumber) {
                    System.out.println("Du gewinnst!");
                }
                if (computerNumber > playerNumber) {
                    System.out.println("Der Computer gewinnt!");
                }
                if (playerNumber == computerNumber) {
                    System.out.println("Es ist unentschieden!");
                }
            }
            if (prompt == 2) {
                break;
            }

        }
    }

    public static int get_dice_number() {
        Random randomNumberGenerator = new Random();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int randomNumber = randomNumberGenerator.nextInt(1, 7);
            sum += randomNumber;
        }
        return sum;
    }
    public static void print_header(){
        System.out.println("1. Spielen" +
                            "\n2. Beenden");
    }
}
