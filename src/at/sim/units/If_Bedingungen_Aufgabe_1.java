package at.sim.units;

import java.util.Random;

public class If_Bedingungen_Aufgabe_1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println("Medium");
        } else if (randomNumber > 50) {
            System.out.println("Large");
        }

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"

    }
}
