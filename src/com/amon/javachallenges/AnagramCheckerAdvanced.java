package com.amon.javachallenges;

// A java class that for an array of strings, return separate lists that group anagrams together

// java libraries
import java.util.*;

public class AnagramCheckerAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the advanced anagram grouping challenge!");
        System.out.println("Type 'exit' to quit at any time.\n");

        while (true) {
            System.out.print("Enter a list of words separated by commas: ");
            input = scanner.nextLine().trim();

            // allow the user to terminate
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! see you next time");
                break;
            }

            String[] words = input.split(",");
            List<List<String>> groupedAnagrams = groupAnagrams(words);
            System.out.println("Grouped anagrams: " + groupedAnagrams + "\n");
        }
        scanner.close();
    }

    // a function to group the anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0 ) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            str = str.trim().toLowerCase();

            // convert each string to a sorted character array
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            //group  where key is sorted version of the string
            anagramMap.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        // return the values of the map as grouped lists of anagrams
        return new ArrayList<>(anagramMap.values());
    }
}
