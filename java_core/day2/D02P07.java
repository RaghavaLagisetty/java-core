package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the percentage");
	int percentage=sc.nextInt();
	sc.close();
	
	String grade;
	
	if(percentage>=60) {
		grade="Grade A";
	}else if(percentage>=45) {
		grade="Grade B";
	}else if(percentage>=35) {
		grade="Grade C";
	}else if(percentage<35) {
		grade="fail";
	}else {
		grade="Invalid";
	}
	System.out.println(grade);
}
}
