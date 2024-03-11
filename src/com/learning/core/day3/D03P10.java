package com.learning.core.day3;
import java.util.Scanner;

public class D03P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int longestPrefixSuffixLength = findLongestPrefixSuffixLength(str);
        
        System.out.println(longestPrefixSuffixLength);
        
        scanner.close();
    }
    
    public static int findLongestPrefixSuffixLength(String str) {
        int n = str.length();
        int[] lps = computeLPS(str);
        return lps[n - 1];
    }
    
    private static int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}
