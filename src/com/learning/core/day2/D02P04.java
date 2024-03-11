package com.learning.core.day2;
import java.util.Scanner;

public class D02P04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter value a");
	int a=sc.nextInt();
	System.out.println("Enter value b");
	int b=sc.nextInt();
	System.out.println("Enter value c");
	int c=sc.nextInt();
	sc.close();
	
	if(a>b) {
		System.out.println(a);
	}else if (b>c) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
}
}
