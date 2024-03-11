package com.learning.core.day3;
import java.util.Scanner;

public class D03P01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		sc.close();
		
		String uppercase=input.toUpperCase();
		System.out.println("upper case string:"+uppercase);
		
		boolean isPalindrome=isPalindrome(input);
		
		if(isPalindrome) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
