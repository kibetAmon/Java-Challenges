package com.amon.javachallenges;

// A java class that checks for anagrams; words that have same letters but in different order

// java libraries
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1, input2;

        System.out.println("Welcome to the Anagram checker challenge!");
        System.out.println("Type 'exit' to quit at any time.\n");

        while (true) {

            // first input from the user
            System.out.print("Enter the first string: ");
            input1 = scanner.nextLine().trim();

            // allow the user to enter a command to end
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! see you next time.");
                break;
            }

            //second input from the user
            System.out.println("Enter the second string: ");
            input2 = scanner.nextLine().trim();

            // allow the user to enter a command to end
            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! see you next time.");
                break;
            }

            boolean result = areAnagrams(input1, input2);
            System.out.println("Are the strings anagrams? " + result + "\n");
        }
        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        //convert to lowercase and remove whitespace
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
