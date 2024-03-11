package com.learning.core.day3;
import java.util.Scanner;


public class D03P12 {
 
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        boolean canSplit = canSplitIntoFourDistinctSubstrings(input);
        
        
        if (canSplit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
    
    public static boolean canSplitIntoFourDistinctSubstrings(String str) {
        int n = str.length();
        
       
        if (n < 4) {
            return false;
        }
        
        
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if all four substrings are distinct
                    if (!str.substring(0, i).equals(str.substring(i, j)) && 
                        !str.substring(0, i).equals(str.substring(j, k)) && 
                        !str.substring(0, i).equals(str.substring(k))) {
                        if (!str.substring(i, j).equals(str.substring(j, k)) &&
                            !str.substring(i, j).equals(str.substring(k))) {
                            if (!str.substring(j, k).equals(str.substring(k))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        return false;
    }
}



