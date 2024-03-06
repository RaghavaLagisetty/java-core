package com.learning.core.day3;
import java.util.Scanner;

public class D03P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Replace spaces with '%20'
        String replacedString = replaceSpaces(input);
        
        // Output the result
        System.out.println( replacedString);
        
        scanner.close();
    }
    
    public static String replaceSpaces(String str) {
        StringBuilder replacedString = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                replacedString.append("%20");
            } else {
                replacedString.append(ch);
            }
        }
        
        return replacedString.toString();
    }
}
