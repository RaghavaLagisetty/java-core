package com.learning.core.day3;
import java.util.Scanner;

public class D03P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int minDeletions = findMinDeletions(str);
        
        System.out.println(minDeletions);
        
        scanner.close();
    }
    
    public static int findMinDeletions(String str) {
        // Length of the string
        int n = str.length();
        
        // Create a table to store subproblems results
        int[][] dp = new int[n][n];
        
        // Fill the table for all substrings from length 1 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1; // ending index of the substring
                
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Minimum number of deletions required to make the string a palindrome
        return dp[0][n - 1];
    }
}

