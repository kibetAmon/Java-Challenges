package com.amon.javachallenges;

// A java class that does word reversal by taking an input of string of words and outputs words in reverse

// java libraries
import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println(" Welcome to the Word Reversal Challenge!");
        System.out.println("Type 'exit' to quit at any time.\n");

        while (true) {
            System.out.print("Enter a string of words: ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Goodbye! See you next time.");
                break;
            }
            String reversed = reverseWords(input);
            System.out.println("Reversed: " + reversed + "\n");
        }
        scanner.close();
    }

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // split the input to break the string into words
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        // iterate over the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}

