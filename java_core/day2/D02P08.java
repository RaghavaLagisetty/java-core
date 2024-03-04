package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the num1");;
	int num1=sc.nextInt();
	
	System.out.println("Enter the num2");
	int num2=sc.nextInt();
	sc.close();
	int sum=0;
	
	for(int i=num1;i<=num2;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
}
}
