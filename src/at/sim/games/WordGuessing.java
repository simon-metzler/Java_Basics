package at.sim.games;

import java.util.Random;

public class WordGuessing {
    public static void main(String[] args) {
        boolean isGameRunning = true;
        String word = "Leander";
        System.out.println(getSecretLetters(word, 2)[0]);








    }

    public static String[] getSecretLetters (String word, int amount) {
        Random randomNumberGenerator = new Random();
        String[] word_as_array = word.split("");
        String[] secret_letters = new String[amount];

        int count = 0;

        while (secret_letters.length < amount){

            int random_number = randomNumberGenerator.nextInt(0, word_as_array.length);
            String random_letter = word_as_array[random_number];
            boolean use_letter = true;
            for (String letter : secret_letters) {

                if(random_letter == letter){
                    use_letter = false;
                }
            }
            if(use_letter){
                secret_letters[count] = random_letter;
                count += 1;
            }

        }

        return secret_letters;

    }
}
