package at.sim.exercises.string_helper_exercise;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(StringHelper.isPalindrome(input));
        System.out.println(StringHelper.countLetters(input, 'l'));
        System.out.println(StringHelper.reverseString(input));
        StringHelper.printAmountOfLetters(input);
    }
}