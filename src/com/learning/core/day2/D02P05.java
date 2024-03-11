package com.learning.core.day2;
import java.util.Scanner;

public class D02P05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num=sc.nextInt();
	sc.close();
	
	if(num%5==0) {
		System.out.println("Number is divisibe by 5");
	}else {
		System.out.println("Number is not divisible by 5");
	}
}
}
