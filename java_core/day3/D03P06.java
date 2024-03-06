package com.learning.core.day3;
import java.util.Scanner;

public class D03P06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String input=sc.nextLine();
	
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	
	int vowelcount=countVowels(input);
	if(n>vowelcount) {
		System.out.println("Mismatch");
	}else {
		String lastvowels=lastVowels(input,n);
		System.out.println(lastvowels);
	}
	sc.close();
}

public static int countVowels(String str) {
	int count=0;
	for(char ch:str.toLowerCase().toCharArray()) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
	}
	return count;
}

public static String lastVowels(String str,int n) {
	 StringBuilder lastNVowels = new StringBuilder();
     int count = 0;
     for (int i = str.length() - 1; i >= 0 && count < n; i--) {
         char ch = Character.toLowerCase(str.charAt(i));
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             lastNVowels.insert(0, ch + " ");
             count++;
         }
     }
     return lastNVowels.toString().trim();
}
}
