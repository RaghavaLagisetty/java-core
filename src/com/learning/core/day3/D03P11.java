package com.learning.core.day3;
import java.util.*;
import java.util.Scanner;

public class D03P11 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dictionary of words
        System.out.println("Enter the dictionary of words (separated by spaces):");
        String dictionaryInput = scanner.nextLine();
        String[] dictionary = dictionaryInput.split("\\s+");
        
        // Input pattern
        System.out.print("Enter the pattern: ");
        String pattern = scanner.next();
        
        // Find matching words
        List<String> matchingWords = findMatchingWords(dictionary, pattern);
        
        // Print output
        System.out.println("Matching words:");
        for (String word : matchingWords) {
            System.out.println(word);
        }
        
        scanner.close();
    }
    
    public static List<String> findMatchingWords(String[] dictionary, String pattern) {
        List<String> matchingWords = new ArrayList<>();
        for (String word : dictionary) {
            if (matchesPattern(word, pattern)) {
                matchingWords.add(word);
            }
        }
        return matchingWords;
    }
    
    public static boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char chWord = word.charAt(i);
            char chPattern = pattern.charAt(i);
            if (chPattern == '*') {
                continue;
            }
            if (chPattern != '?' && chPattern != chWord) {
                return false;
            }
        }
        return true;
    }
}


