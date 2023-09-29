package at.sim.exercises;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bal = 0;


        System.out.println("Bankomat" +
                "\n 1. Einzahlen" +
                "\n 2. Abheben" +
                "\n 3. Kontostand" +
                "\n 4. Beenden");

        while (true) {

            System.out.println("Eingabe: ");
            int prompt = scanner.nextInt();

            if (prompt == 1) {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten: ");
                int amount = scanner.nextInt();
                bal += amount;
                System.out.println("Es wurden " + amount + " eingezahlt.");
            }
            if (prompt == 2) {
                System.out.println("Wie viel möchten Sie gerne abheben: ");
                int amount = scanner.nextInt();
                bal -= amount;
                System.out.println("Es wurden " + amount + " abgehoben.");
            }
            if (prompt == 3) {
                System.out.println("Kontostand: " + bal + "€");
            }
            if (prompt == 4) {
                break;
            }


        }

    }
}
