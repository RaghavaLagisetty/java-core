package com.learning.core.day5;
import java.util.Scanner;
import java.util.*;

public class D05P02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	ArrayList<String> std=new ArrayList<>();
	
	String input=sc.nextLine();
	String[] names=input.split(" ");
	for(String name:names) {
		std.add(name);
	}
	
	String srName=sc.nextLine();
	
	if(std.contains(srName)) {
		System.out.println("Found");
	}else {
		System.out.println("Not Found");
	}
	
}
}
