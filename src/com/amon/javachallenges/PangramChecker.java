package com.amon.javachallenges;

// A java class that checks for pangrams; a sentence that contains all the 26 alphabets

// java libraries
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the pangram checker challenge!");
        System.out.println("Type 'exit' to quit at any time.\n");

        while (true) {
            System.out.print("Enter a sentence: ");
            input = scanner.nextLine().trim();

            // allow the user to terminate
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! see you next time.");
                break;
            }

            // check if the input is pangram
            boolean isPangram = checkPangram(input);
            System.out.println("Is the input a panagram? " + isPangram + "\n");
        }
        scanner.close();
    }

    public static boolean checkPangram(String sentence) {
        if (sentence == null) {
            return false;
        }
        //track unique letters
        Set<Character> alphabetSet = new HashSet<>();
        // convert the input string to lowercase and remove non-alphabetic characters
        sentence = sentence.toLowerCase();
        // check for pangrams
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabetSet.add(ch);
            }
            // early exit if all letters are found
            if (alphabetSet.size() ==26) {
                return true;
            }
        }

        return alphabetSet.size() == 26;
    }
}
