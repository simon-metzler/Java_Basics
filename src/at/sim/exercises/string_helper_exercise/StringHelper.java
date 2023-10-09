package at.sim.exercises.string_helper_exercise;

public class StringHelper {
    public static Boolean isPalindrome(String input) {
        return true;
    }
    public static int count_letters(String input_string, char input_char) {
        int count = 0;

        for (int i = 0; i < input_string.length(); i++) {
            if (input_string.charAt(i) == input_char) {
                count ++;
            }
        }
        return count;
    }
    public static String reverse_string(String input) {
        String output = "";
        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            output = character + output;
        }
        return output;
    }
    public static void print_amount_of_letters(String input) {
        String[] character_list = new String[1000];
        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            character_list[character] += 1;
        }
        for (int i = 0; i < character_list.length; i++) {

        }
    }
}
