package com.learning.core.day3;
import java.util.*;

public class D03P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        
        String result = findChainedString(strings);
        if (result != null) {
            System.out.println("The given strings can be chained to form a circle:");
            System.out.println(result);
        } else {
            System.out.println("The given strings cannot be chained to form a circle.");
        }
        
        scanner.close();
    }
    
    public static String findChainedString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return null;
        }
        
        Map<Character, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, new ArrayList<>());
            }
            map.get(firstChar).add(str);
            if (firstChar != lastChar) {
                if (!map.containsKey(lastChar)) {
                    map.put(lastChar, new ArrayList<>());
                }
                map.get(lastChar).add(str);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        char startChar = strings[0].charAt(0);
        if (dfs(map, startChar, sb, strings.length)) {
            return sb.toString();
        }
        
        return null;
    }
    
    private static boolean dfs(Map<Character, List<String>> map, char currChar, StringBuilder sb, int len) {
        if (sb.length() == len) {
            return true;
        }
        
        if (!map.containsKey(currChar)) {
            return false;
        }
        
        List<String> candidateStrings = map.get(currChar);
        for (String candidate : candidateStrings) {
            if (sb.indexOf(candidate) != -1) {
                continue; // skip already used string
            }
            char nextChar = candidate.charAt(candidate.length() - 1);
            sb.append(candidate);
            map.get(currChar).remove(candidate);
            if (dfs(map, nextChar, sb, len)) {
                return true;
            }
            sb.delete(sb.length() - candidate.length(), sb.length());
            map.get(currChar).add(candidate);
        }
        
        return false;
    }
}

