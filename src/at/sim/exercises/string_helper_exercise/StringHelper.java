package at.sim.exercises.string_helper_exercise;

public class StringHelper {
    public static Boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++)
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        return true;
    }

    public static int countLetters(String input_string, char input_char) {
        int count = 0;

        for (int i = 0; i < input_string.length(); i++) {
            if (input_string.charAt(i) == input_char) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String input) {
        String output = "";
        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            output = character + output;
        }
        return output;
    }

    public static void printAmountOfLetters(String input) {
        int[] character_list = new int[1000];
        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            character_list[character] += 1;
        }
        for (char i = 0; i < character_list.length; i++) {
            int amount = character_list[i];
            if (amount > 0) {
                System.out.println(i + ": " + amount);
            }
        }
    }
}
