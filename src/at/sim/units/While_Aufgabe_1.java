package at.sim.units;


import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int sum = 0;

        while (true) {
            int randomNumber = random.nextInt(10, 31);
            if (randomNumber == 15 || randomNumber == 25) {
                break;
            } else {
                sum += randomNumber;

            }


        }
        System.out.println(sum);

    }
}
