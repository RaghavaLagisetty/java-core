package com.learning.core.day3;
import java.util.Scanner;


public class D03P05 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the numbers: ");
	        String[] input = scanner.nextLine().split(" ");
	        int[] arr = new int[input.length];
	        for (int i = 0; i < input.length; i++) {
	            arr[i] = Integer.parseInt(input[i]);
	        }
	        
	        System.out.print("Enter the value of k: ");
	        int k = scanner.nextInt();
	        
	        System.out.println("Distinct combinations of " + k + " numbers:");
	        generateCombinations(arr, "", 0, k);
	        
	        scanner.close();
	    }
	    
	    public static void generateCombinations(int[] arr, String combination, int start, int k) {
	        if (k == 0) {
	            System.out.println(combination);
	            return;
	        }
	        
	        for (int i = start; i <= arr.length - k; i++) {
	            generateCombinations(arr, combination + arr[i], i + 1, k - 1);
	        }
	    }
	

}
