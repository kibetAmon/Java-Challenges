package com.amon.javachallenges;

// A java class that make a perfect pangram checker where a sentence uses each alphabet once

// java libraries
import java.util.Scanner;

public class PerfectPangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the perfect pangram checker!");
        System.out.println("Type 'exit' to quit at anytime.\n");

        while (true) {
            System.out.print("Enter a sentence: ");
            input = scanner.nextLine().trim();

            // allow the user to terminate
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!see you next time.");
                break;
            }

            // check for perfect pangram
            boolean isPerfectPangram = checkPerfectPangram(input);
            System.out.println("Is the input a perfect pangram? " + isPerfectPangram + "\n" );
        }
        scanner.close();
    }

    public static boolean checkPerfectPangram(String sentence) {
        if (sentence == null) {
            return false;
        }

        // array to store occurrences of each letter
        int[] letterCount = new int[26];
        sentence = sentence.toLowerCase();

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++;
            }
        }

        // check if every letter appears exactly once
        for (int count : letterCount) {
            if (count != 1) {
                return false;
            }
        }

        return true;
    }
}

