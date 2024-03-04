package com.learning.core.day2;
import java.util.Scanner;

public class D02P09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the input");
	int num=sc.nextInt();
	int res=0;
	
	for(int i=1;i<=num;i++) {
		 res=i*i*i;
		System.out.println(res);
	}
	sc.close();
}
}
