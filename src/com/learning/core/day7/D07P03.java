package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P03 {
	public static String reverseSt(String input) {
		Stack<Character> st=new Stack<>();
		StringBuilder reverse=new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			st.push(input.charAt(i));
		}
		
		while(!st.isEmpty()) {
			reverse.append(st.pop());
		}
		return reverse.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		String reversed=reverseSt(input);
		System.out.println(reversed);
	}

}
